import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agq implements zs<ach> {
   public static final zj<ww, agq> a = zj.a(zh.h, agq::b, agq.a.b.a(zh.a()), agq::e, agq::new);
   private final int b;
   private final List<agq.a> c;

   public agq(int $$0, Collection<bwi> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bwi $$2 : $$1) {
         this.c.add(new agq.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agq(int $$0, List<agq.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zu<agq> a() {
      return agw.bc;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agq.a> e() {
      return this.c;
   }

   public static record a(jq<bwh> c, double d, Collection<bwk> e) {
      public static final zj<ByteBuf, bwk> a = zj.a(all.b, bwk::b, zh.k, bwk::c, bwk.a.e, bwk::d, bwk::new);
      public static final zj<ww, agq.a> b = zj.a(bwh.b, agq.a::a, zh.k, agq.a::b, a.a(zh.a(ArrayList::new)), agq.a::c, agq.a::new);

      public jq<bwh> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bwk> c() {
         return this.e;
      }
   }
}
