import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agk implements zs<ace> {
   public static final zj<ww, agk> a = zj.a(zh.g, agk::b, agk.a.b.a(zh.a()), agk::e, agk::new);
   private final int b;
   private final List<agk.a> c;

   public agk(int $$0, Collection<buo> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (buo $$2 : $$1) {
         this.c.add(new agk.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agk(int $$0, List<agk.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zu<agk> a() {
      return agq.bb;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agk.a> e() {
      return this.c;
   }

   public static record a(ji<bun> c, double d, Collection<buq> e) {
      public static final zj<ByteBuf, buq> a = zj.a(
         kc.g, buq::b, zh.j, buq::d, buq.a.e, buq::e, ($$0, $$1, $$2) -> new buq($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final zj<ww, agk.a> b = zj.a(zh.b(lq.c), agk.a::a, zh.j, agk.a::b, a.a(zh.a(ArrayList::new)), agk.a::c, agk.a::new);

      public ji<bun> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<buq> c() {
         return this.e;
      }
   }
}
