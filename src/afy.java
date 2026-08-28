import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afy implements yw<abl> {
   public static final yn<wa, afy> a = yn.a(yl.h, afy::b, afy.a.b.a(yl.a()), afy::e, afy::new);
   private final int b;
   private final List<afy.a> c;

   public afy(int $$0, Collection<bwl> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bwl $$2 : $$1) {
         this.c.add(new afy.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afy(int $$0, List<afy.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public yy<afy> a() {
      return age.bg;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afy.a> e() {
      return this.c;
   }

   public static record a(jr<bwk> c, double d, Collection<bwn> e) {
      public static final yn<ByteBuf, bwn> a = yn.a(akv.b, bwn::b, yl.m, bwn::c, bwn.a.e, bwn::d, bwn::new);
      public static final yn<wa, afy.a> b = yn.a(bwk.b, afy.a::a, yl.m, afy.a::b, a.a(yl.a(ArrayList::new)), afy.a::c, afy.a::new);

      public jr<bwk> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bwn> c() {
         return this.e;
      }
   }
}
