import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agl implements zj<aby> {
   public static final za<wn, agl> a = za.a(yy.h, agl::b, agl.a.b.a(yy.a()), agl::e, agl::new);
   private final int b;
   private final List<agl.a> c;

   public agl(int $$0, Collection<byy> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (byy $$2 : $$1) {
         this.c.add(new agl.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agl(int $$0, List<agl.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zl<agl> a() {
      return agr.bg;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agl.a> e() {
      return this.c;
   }

   public static record a(jg<byx> c, double d, Collection<bza> e) {
      public static final za<ByteBuf, bza> a = za.a(alk.b, bza::a, yy.m, bza::b, bza.a.e, bza::c, bza::new);
      public static final za<wn, agl.a> b = za.a(byx.b, agl.a::a, yy.m, agl.a::b, a.a(yy.a(ArrayList::new)), agl.a::c, agl.a::new);

      public jg<byx> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bza> c() {
         return this.e;
      }
   }
}
