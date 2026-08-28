import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class add {
   private static final int a = 2097152;
   private final tx b;
   private final byte[] c;
   private final List<add.a> d;

   public add(ebv $$0) {
      this.b = new tx();

      for (Entry<efn.a, efn> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new ue($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vs(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<iu, dwn> $$2 : $$0.I().entrySet()) {
         this.d.add(add.a.a($$2.getValue()));
      }
   }

   public add(wh $$0, int $$1, int $$2) {
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
            this.d = add.a.b.decode($$0);
         }
      }
   }

   public void a(wh $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      add.a.b.encode($$0, this.d);
   }

   private static int a(ebv $$0) {
      int $$1 = 0;

      for (ebw $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vs $$0, ebv $$1) {
      for (ebw $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<add.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(add.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iu.a $$5 = new iu.a();

      for (add.a $$6 : this.d) {
         int $$7 = $$3 + jx.b($$6.c >> 4);
         int $$8 = $$4 + jx.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vs a() {
      return new vs(Unpooled.wrappedBuffer(this.c));
   }

   public tx b() {
      return this.b;
   }

   static class a {
      public static final yu<wh, add.a> a = yu.a(add.a::a, add.a::new);
      public static final yu<wh, List<add.a>> b = a.a(ys.a());
      final int c;
      final int d;
      final dwp<?> e;
      @Nullable
      final tx f;

      private a(int $$0, int $$1, dwp<?> $$2, @Nullable tx $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wh $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = ys.a(mg.e).decode($$0);
         this.f = $$0.o();
      }

      private void a(wh $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         ys.a(mg.e).encode($$0, this.e);
         $$0.a(this.f);
      }

      static add.a a(dwn $$0) {
         tx $$1 = $$0.a($$0.i().F_());
         iu $$2 = $$0.aw_();
         int $$3 = jx.b($$2.u()) << 4 | jx.b($$2.w());
         return new add.a($$3, $$2.v(), $$0.p(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iu var1, dwp<?> var2, @Nullable tx var3);
   }
}
