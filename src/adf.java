import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adf {
   private static final int a = 2097152;
   private final tz b;
   private final byte[] c;
   private final List<adf.a> d;

   public adf(eco $$0) {
      this.b = new tz();

      for (Entry<egg.a, egg> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new ug($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vu(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<iu, dxf> $$2 : $$0.I().entrySet()) {
         this.d.add(adf.a.a($$2.getValue()));
      }
   }

   public adf(wj $$0, int $$1, int $$2) {
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
            this.d = adf.a.b.decode($$0);
         }
      }
   }

   public void a(wj $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adf.a.b.encode($$0, this.d);
   }

   private static int a(eco $$0) {
      int $$1 = 0;

      for (ecp $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vu $$0, eco $$1) {
      for (ecp $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adf.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adf.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iu.a $$5 = new iu.a();

      for (adf.a $$6 : this.d) {
         int $$7 = $$3 + jx.b($$6.c >> 4);
         int $$8 = $$4 + jx.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vu a() {
      return new vu(Unpooled.wrappedBuffer(this.c));
   }

   public tz b() {
      return this.b;
   }

   static class a {
      public static final yw<wj, adf.a> a = yw.a(adf.a::a, adf.a::new);
      public static final yw<wj, List<adf.a>> b = a.a(yu.a());
      final int c;
      final int d;
      final dxh<?> e;
      @Nullable
      final tz f;

      private a(int $$0, int $$1, dxh<?> $$2, @Nullable tz $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wj $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yu.a(mg.e).decode($$0);
         this.f = $$0.o();
      }

      private void a(wj $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yu.a(mg.e).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adf.a a(dxf $$0) {
         tz $$1 = $$0.a($$0.i().F_());
         iu $$2 = $$0.ax_();
         int $$3 = jx.b($$2.u()) << 4 | jx.b($$2.w());
         return new adf.a($$3, $$2.v(), $$0.p(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iu var1, dxh<?> var2, @Nullable tz var3);
   }
}
