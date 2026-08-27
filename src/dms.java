import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dms implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dmr> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dms(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dmr b(cte $$0) throws IOException {
      long $$1 = cte.c($$0.h(), $$0.i());
      dmr $$2 = (dmr)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dmr)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dmr $$4 = new dmr($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public so a(cte $$0) throws IOException {
      dmr $$1 = this.b($$0);

      so var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = tb.a($$2);
      }

      return var4;
   }

   public void a(cte $$0, ti $$1) throws IOException {
      dmr $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            tb.a((DataInput)$$3, $$1, sx.a());
         }
      }
   }

   protected void a(cte $$0, @Nullable so $$1) throws IOException {
      dmr $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            tb.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      atw<IOException> $$0 = new atw<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dmr $$1 = (dmr)var2.next();

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
         dmr $$0 = (dmr)var1.next();
         $$0.a();
      }
   }
}
