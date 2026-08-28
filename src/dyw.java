import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dyw implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dyv> c = new Long2ObjectLinkedOpenHashMap();
   private final dyy d;
   private final Path e;
   private final boolean f;

   dyw(dyy $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dyv b(deh $$0) throws IOException {
      long $$1 = deh.c($$0.h(), $$0.i());
      dyv $$2 = (dyv)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dyv)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dyv $$4 = new dyv(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public uk a(deh $$0) throws IOException {
      dyv $$1 = this.b($$0);

      uk var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = ux.a($$2);
      }

      return var4;
   }

   public void a(deh $$0, ve $$1) throws IOException {
      dyv $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            ux.a((DataInput)$$3, $$1, ut.a());
         }
      }
   }

   protected void a(deh $$0, @Nullable uk $$1) throws IOException {
      dyv $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            ux.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ays<IOException> $$0 = new ays<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dyv $$1 = (dyv)var2.next();

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
         dyv $$0 = (dyv)var1.next();
         $$0.b();
      }
   }

   public dyy b() {
      return this.d;
   }
}
