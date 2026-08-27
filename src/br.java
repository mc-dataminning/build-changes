import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(bjt var1, alq var2, @Nullable eif var3);

   br.a a();

   static br a(bvy $$0) {
      return br.b.f.a($$0);
   }

   static br a(bwf $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(bjt $$0, alq $$1, @Nullable eif $$2) {
            return true;
         }

         @Override
         public br.a a() {
            return br.b.a;
         }
      }));
      public static final br.a b = new br.a(ch.b);
      public static final br.a c = new br.a(bv.c);
      public static final br.a d = new br.a(cr.c);
      public static final br.a e = new br.a(cy.b);
      public static final bt<bvy> f = bt.a(jy.ak, $$0 -> $$0 instanceof bvx $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bt<bwf> g = bt.a(jy.al, $$0 -> $$0 instanceof bxj $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bt<bxb.d> h = bt.a(bxb.d.f, $$0 -> $$0 instanceof bxb $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bt<ceq.b> i = bt.a(ceq.b.j, $$0 -> $$0 instanceof ceq $$1 ? Optional.of($$1.x()) : Optional.empty());
      public static final bt<bwe.v> j = bt.a(bwe.v.c, $$0 -> $$0 instanceof bwe $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bwh.a> k = bt.a(bwh.a.c, $$0 -> $$0 instanceof bwh $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<ib<bzm>> l = bt.a(jy.m.r(), $$0 -> $$0 instanceof bzl $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bwo.g> m = bt.a(bwo.g.h, $$0 -> $$0 instanceof bwo $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bt<byc> n = bt.a(byc.h, $$0 -> $$0 instanceof bxv $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bxw.d> o = bt.a(bxw.d.e, $$0 -> $$0 instanceof bxw $$1 ? Optional.of($$1.gq()) : Optional.empty());
      public static final bt<ccp> p = bt.a(jy.z.q(), $$0 -> $$0 instanceof ccm $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bwk.b> q = bt.a(bwk.b.f, $$0 -> $$0 instanceof bwk $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bt<bwu.b> r = bt.a(bwu.b.m, $$0 -> $$0 instanceof bwu $$1 ? Optional.of($$1.gp()) : Optional.empty());
      public static final BiMap<String, br.a> s = ImmutableBiMap.builder()
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
      public static final Codec<br.a> t = asg.a(s.inverse()::get, s::get);
   }
}
