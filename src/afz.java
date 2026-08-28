import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afz implements zf<abt> {
   public static final yw<wj, afz> a = yw.a(yu.g, afz::b, afz.a.b.a(yu.a()), afz::e, afz::new);
   private final int b;
   private final List<afz.a> c;

   public afz(int $$0, Collection<buq> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (buq $$2 : $$1) {
         this.c.add(new afz.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afz(int $$0, List<afz.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zh<afz> a() {
      return agf.bb;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afz.a> e() {
      return this.c;
   }

   public static record a(jm<bup> c, double d, Collection<bus> e) {
      public static final yw<ByteBuf, bus> a = yw.a(akq.b, bus::b, yu.j, bus::c, bus.a.e, bus::d, bus::new);
      public static final yw<wj, afz.a> b = yw.a(bup.b, afz.a::a, yu.j, afz.a::b, a.a(yu.a(ArrayList::new)), afz.a::c, afz.a::new);

      public jm<bup> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bus> c() {
         return this.e;
      }
   }
}
