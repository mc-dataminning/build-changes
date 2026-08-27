import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afv implements ze<abq> {
   public static final yv<wi, afv> a = yv.a(yt.f, afv::b, afv.a.b.a(yt.a()), afv::e, afv::new);
   private final int b;
   private final List<afv.a> c;

   public afv(int $$0, Collection<bts> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bts $$2 : $$1) {
         this.c.add(new afv.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afv(int $$0, List<afv.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zg<afv> a() {
      return agb.bb;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afv.a> e() {
      return this.c;
   }

   public static record a(ix<btr> c, double d, Collection<btu> e) {
      public static final yv<ByteBuf, btu> a = yv.a(
         jr.g, btu::b, yt.i, btu::d, btu.a.e, btu::e, ($$0, $$1, $$2) -> new btu($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final yv<wi, afv.a> b = yv.a(yt.b(lf.c), afv.a::a, yt.i, afv.a::b, a.a(yt.a(ArrayList::new)), afv.a::c, afv.a::new);

      public ix<btr> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<btu> c() {
         return this.e;
      }
   }
}
