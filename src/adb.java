import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adb {
   private static final int a = 2097152;
   private final ud b;
   private final byte[] c;
   private final List<adb.a> d;

   public adb(dth $$0) {
      this.b = new ud();

      for (Entry<dwt.a, dwt> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uk($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vx(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<io, dog> $$2 : $$0.G().entrySet()) {
         this.d.add(adb.a.a($$2.getValue()));
      }
   }

   public adb(wi $$0, int $$1, int $$2) {
      this.b = $$0.o();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.l();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = adb.a.b.decode($$0);
         }
      }
   }

   public void a(wi $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adb.a.b.encode($$0, this.d);
   }

   private static int a(dth $$0) {
      int $$1 = 0;

      for (dti $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vx $$0, dth $$1) {
      for (dti $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adb.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adb.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      io.a $$5 = new io.a();

      for (adb.a $$6 : this.d) {
         int $$7 = $$3 + jq.b($$6.c >> 4);
         int $$8 = $$4 + jq.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vx a() {
      return new vx(Unpooled.wrappedBuffer(this.c));
   }

   public ud b() {
      return this.b;
   }

   static class a {
      public static final yv<wi, adb.a> a = yv.a(adb.a::a, adb.a::new);
      public static final yv<wi, List<adb.a>> b = a.a(yt.a());
      final int c;
      final int d;
      final doi<?> e;
      @Nullable
      final ud f;

      private a(int $$0, int $$1, doi<?> $$2, @Nullable ud $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wi $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yt.a(lf.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wi $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         yt.a(lf.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adb.a a(dog $$0) {
         ud $$1 = $$0.a($$0.i().H_());
         io $$2 = $$0.az_();
         int $$3 = jq.b($$2.u()) << 4 | jq.b($$2.w());
         return new adb.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(io var1, doi<?> var2, @Nullable ud var3);
   }
}
