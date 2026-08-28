import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ahe implements aac<acr> {
   public static final zt<xg, ahe> a = zt.a(zr.h, ahe::b, ahe.a.b.a(zr.a()), ahe::e, ahe::new);
   private final int b;
   private final List<ahe.a> c;

   public ahe(int $$0, Collection<bxk> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bxk $$2 : $$1) {
         this.c.add(new ahe.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private ahe(int $$0, List<ahe.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public aae<ahe> a() {
      return ahk.bg;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<ahe.a> e() {
      return this.c;
   }

   public static record a(jq<bxj> c, double d, Collection<bxm> e) {
      public static final zt<ByteBuf, bxm> a = zt.a(alz.b, bxm::b, zr.m, bxm::c, bxm.a.e, bxm::d, bxm::new);
      public static final zt<xg, ahe.a> b = zt.a(bxj.b, ahe.a::a, zr.m, ahe.a::b, a.a(zr.a(ArrayList::new)), ahe.a::c, ahe.a::new);

      public jq<bxj> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bxm> c() {
         return this.e;
      }
   }
}
