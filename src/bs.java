import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bs {
   Codec<bs> a = bs.b.t.dispatch(bs::a, $$0 -> $$0.a().codec());

   boolean a(bqa var1, apu var2, @Nullable esj var3);

   bs.a a();

   static bs a(ccm $$0) {
      return bs.b.f.a($$0);
   }

   static bs a(cct $$0) {
      return bs.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bs> a) {
   }

   public static final class b {
      public static final bs.a a = new bs.a(MapCodec.unit(new bs() {
         @Override
         public boolean a(bqa $$0, apu $$1, @Nullable esj $$2) {
            return true;
         }

         @Override
         public bs.a a() {
            return bs.b.a;
         }
      }));
      public static final bs.a b = new bs.a(ci.b);
      public static final bs.a c = new bs.a(bw.c);
      public static final bs.a d = new bs.a(cs.c);
      public static final bs.a e = new bs.a(cz.b);
      public static final bu<ccm> f = bu.a(kt.ak, $$0 -> $$0 instanceof ccl $$1 ? Optional.of($$1.gu()) : Optional.empty());
      public static final bu<cct> g = bu.a(kt.al, $$0 -> $$0 instanceof cec $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bu<cdu.d> h = bu.a(cdu.d.f, $$0 -> $$0 instanceof cdu $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<clx.b> i = bu.a(clx.b.j, $$0 -> $$0 instanceof clx $$1 ? Optional.of($$1.x()) : Optional.empty());
      public static final bu<ccs.v> j = bu.a(ccs.v.c, $$0 -> $$0 instanceof ccs $$1 ? Optional.of($$1.u()) : Optional.empty());
      public static final bu<ccv.a> k = bu.a(ccv.a.c, $$0 -> $$0 instanceof ccv $$1 ? Optional.of($$1.u()) : Optional.empty());
      public static final bu<in<cgg>> l = bu.a(kt.l.r(), $$0 -> $$0 instanceof cgf $$1 ? Optional.of($$1.p()) : Optional.empty());
      public static final bu<cdc.g> m = bu.a(cdc.g.h, $$0 -> $$0 instanceof cdc $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<cev> n = bu.a(cev.h, $$0 -> $$0 instanceof ceo $$1 ? Optional.of($$1.r()) : Optional.empty());
      public static final bu<cep.d> o = bu.a(cep.d.e, $$0 -> $$0 instanceof cep $$1 ? Optional.of($$1.gz()) : Optional.empty());
      public static final bu<cjs> p = bu.a(kt.y.q(), $$0 -> $$0 instanceof cjp $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bu<ccy.b> q = bu.a(ccy.b.f, $$0 -> $$0 instanceof ccy $$1 ? Optional.of($$1.gv()) : Optional.empty());
      public static final bu<cdi.b> r = bu.a(cdi.b.m, $$0 -> $$0 instanceof cdi $$1 ? Optional.of($$1.gy()) : Optional.empty());
      public static final BiMap<String, bs.a> s = ImmutableBiMap.builder()
         .put("any", a)
         .put("lightning", b)
         .put("fishing_hook", c)
         .put("player", d)
         .put("slime", e)
         .put("cat", f.a())
         .put("frog", g.a())
         .put("axolotl", h.a())
         .put("boat", i.a())
         .put("fox", j.a())
         .put("mooshroom", k.a())
         .put("painting", l.a())
         .put("rabbit", m.a())
         .put("horse", n.a())
         .put("llama", o.a())
         .put("villager", p.a())
         .put("parrot", q.a())
         .put("tropical_fish", r.a())
         .buildOrThrow();
      public static final Codec<bs.a> t = awu.a(s.inverse()::get, s::get);
   }
}
