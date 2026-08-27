import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afr implements zb<abm> {
   public static final ys<wf, afr> a = ys.a(yq.f, afr::b, afr.a.b.a(yq.a()), afr::e, afr::new);
   private final int b;
   private final List<afr.a> c;

   public afr(int $$0, Collection<btd> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (btd $$2 : $$1) {
         this.c.add(new afr.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afr(int $$0, List<afr.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zd<afr> a() {
      return afx.bb;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afr.a> e() {
      return this.c;
   }

   public static record a(iw<btc> c, double d, Collection<btf> e) {
      public static final ys<ByteBuf, btf> a = ys.a(
         jq.g, btf::b, yq.i, btf::d, btf.a.e, btf::e, ($$0, $$1, $$2) -> new btf($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final ys<wf, afr.a> b = ys.a(yq.b(le.c), afr.a::a, yq.i, afr.a::b, a.a(yq.a(ArrayList::new)), afr.a::c, afr.a::new);

      public iw<btc> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<btf> c() {
         return this.e;
      }
   }
}
