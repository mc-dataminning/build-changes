import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agj implements zh<abw> {
   public static final yy<wl, agj> a = yy.a(yw.h, agj::b, agj.a.b.a(yw.a()), agj::e, agj::new);
   private final int b;
   private final List<agj.a> c;

   public agj(int $$0, Collection<byw> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (byw $$2 : $$1) {
         this.c.add(new agj.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agj(int $$0, List<agj.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zj<agj> a() {
      return agp.bg;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agj.a> e() {
      return this.c;
   }

   public static record a(jf<byv> c, double d, Collection<byy> e) {
      public static final yy<ByteBuf, byy> a = yy.a(ali.b, byy::a, yw.m, byy::b, byy.a.e, byy::c, byy::new);
      public static final yy<wl, agj.a> b = yy.a(byv.b, agj.a::a, yw.m, agj.a::b, a.a(yw.a(ArrayList::new)), agj.a::c, agj.a::new);

      public jf<byv> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<byy> c() {
         return this.e;
      }
   }
}
