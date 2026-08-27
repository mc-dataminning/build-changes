import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class acl {
   private static final int a = 2097152;
   private final to b;
   private final byte[] c;
   private final List<acl.a> d;

   public acl(dro $$0) {
      this.b = new to();

      for (Entry<dva.a, dva> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new tv($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vi(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<id, dmo> $$2 : $$0.G().entrySet()) {
         this.d.add(acl.a.a($$2.getValue()));
      }
   }

   public acl(vt $$0, int $$1, int $$2) {
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
            this.d = acl.a.b.decode($$0);
         }
      }
   }

   public void a(vt $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      acl.a.b.encode($$0, this.d);
   }

   private static int a(dro $$0) {
      int $$1 = 0;

      for (drp $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vi $$0, dro $$1) {
      for (drp $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<acl.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(acl.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      id.a $$5 = new id.a();

      for (acl.a $$6 : this.d) {
         int $$7 = $$3 + jg.b($$6.c >> 4);
         int $$8 = $$4 + jg.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vi a() {
      return new vi(Unpooled.wrappedBuffer(this.c));
   }

   public to b() {
      return this.b;
   }

   static class a {
      public static final yg<vt, acl.a> a = yg.a(acl.a::a, acl.a::new);
      public static final yg<vt, List<acl.a>> b = a.a(ye.a());
      final int c;
      final int d;
      final dmq<?> e;
      @Nullable
      final to f;

      private a(int $$0, int $$1, dmq<?> $$2, @Nullable to $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(vt $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = ye.a(ku.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(vt $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         ye.a(ku.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static acl.a a(dmo $$0) {
         to $$1 = $$0.a($$0.i().H_());
         id $$2 = $$0.az_();
         int $$3 = jg.b($$2.u()) << 4 | jg.b($$2.w());
         return new acl.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(id var1, dmq<?> var2, @Nullable to var3);
   }
}
