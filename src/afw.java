import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afw implements ze<abq> {
   public static final yv<wi, afw> a = yv.a(yt.f, afw::b, afw.a.b.a(yt.a()), afw::e, afw::new);
   private final int b;
   private final List<afw.a> c;

   public afw(int $$0, Collection<btu> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (btu $$2 : $$1) {
         this.c.add(new afw.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afw(int $$0, List<afw.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zg<afw> a() {
      return agc.bb;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afw.a> e() {
      return this.c;
   }

   public static record a(ix<btt> c, double d, Collection<btw> e) {
      public static final yv<ByteBuf, btw> a = yv.a(
         jr.g, btw::b, yt.i, btw::d, btw.a.e, btw::e, ($$0, $$1, $$2) -> new btw($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final yv<wi, afw.a> b = yv.a(yt.b(lf.c), afw.a::a, yt.i, afw.a::b, a.a(yt.a(ArrayList::new)), afw.a::c, afw.a::new);

      public ix<btt> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<btw> c() {
         return this.e;
      }
   }
}
