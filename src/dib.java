import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dib implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dia> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dib(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dia b(cor $$0) throws IOException {
      long $$1 = cor.c($$0.h(), $$0.i());
      dia $$2 = (dia)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dia)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dia $$4 = new dia($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public qs a(cor $$0) throws IOException {
      dia $$1 = this.b($$0);

      qs var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = rc.a((DataInput)$$2);
      }

      return var4;
   }

   public void a(cor $$0, ri $$1) throws IOException {
      dia $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            rc.a((DataInput)$$3, $$1);
         }
      }
   }

   protected void a(cor $$0, @Nullable qs $$1) throws IOException {
      dia $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            rc.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      aqv<IOException> $$0 = new aqv<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dia $$1 = (dia)var2.next();

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
         dia $$0 = (dia)var1.next();
         $$0.a();
      }
   }
}
