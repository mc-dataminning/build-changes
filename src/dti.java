import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dti implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dth> c = new Long2ObjectLinkedOpenHashMap();
   private final dtk d;
   private final Path e;
   private final boolean f;

   dti(dtk $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dth b(czb $$0) throws IOException {
      long $$1 = czb.c($$0.h(), $$0.i());
      dth $$2 = (dth)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dth)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dth $$4 = new dth(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ty a(czb $$0) throws IOException {
      dth $$1 = this.b($$0);

      ty var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = ul.a($$2);
      }

      return var4;
   }

   public void a(czb $$0, us $$1) throws IOException {
      dth $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            ul.a((DataInput)$$3, $$1, uh.a());
         }
      }
   }

   protected void a(czb $$0, @Nullable ty $$1) throws IOException {
      dth $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            ul.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      axd<IOException> $$0 = new axd<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dth $$1 = (dth)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         dth $$0 = (dth)var1.next();
         $$0.b();
      }
   }
}
