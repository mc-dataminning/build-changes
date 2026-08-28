import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ahe implements aac<acr> {
   public static final zt<xg, ahe> a = zt.a(zr.h, ahe::b, ahe.a.b.a(zr.a()), ahe::e, ahe::new);
   private final int b;
   private final List<ahe.a> c;

   public ahe(int $$0, Collection<bxj> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bxj $$2 : $$1) {
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

   public static record a(jq<bxi> c, double d, Collection<bxl> e) {
      public static final zt<ByteBuf, bxl> a = zt.a(alz.b, bxl::b, zr.m, bxl::c, bxl.a.e, bxl::d, bxl::new);
      public static final zt<xg, ahe.a> b = zt.a(bxi.b, ahe.a::a, zr.m, ahe.a::b, a.a(zr.a(ArrayList::new)), ahe.a::c, ahe.a::new);

      public jq<bxi> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bxl> c() {
         return this.e;
      }
   }
}
