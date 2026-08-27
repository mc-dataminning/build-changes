import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(bil var1, akn var2, @Nullable ehi var3);

   br.a a();

   static br a(buq $$0) {
      return br.b.f.a($$0);
   }

   static br a(bux $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(bil $$0, akn $$1, @Nullable ehi $$2) {
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
      public static final bt<buq> f = bt.a(jd.aj, $$0 -> $$0 instanceof bup $$1 ? Optional.of($$1.gh()) : Optional.empty());
      public static final bt<bux> g = bt.a(jd.ak, $$0 -> $$0 instanceof bwb $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bvt.d> h = bt.a(bvt.d.f, $$0 -> $$0 instanceof bvt $$1 ? Optional.of($$1.ga()) : Optional.empty());
      public static final bt<cdi.b> i = bt.a(cdi.b.j, $$0 -> $$0 instanceof cdi $$1 ? Optional.of($$1.v()) : Optional.empty());
      public static final bt<buw.v> j = bt.a(buw.v.c, $$0 -> $$0 instanceof buw $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<buz.a> k = bt.a(buz.a.c, $$0 -> $$0 instanceof buz $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<hg<bye>> l = bt.a(jd.m.r(), $$0 -> $$0 instanceof byd $$1 ? Optional.of($$1.j()) : Optional.empty());
      public static final bt<bvg.g> m = bt.a(bvg.g.h, $$0 -> $$0 instanceof bvg $$1 ? Optional.of($$1.ga()) : Optional.empty());
      public static final bt<bwu> n = bt.a(bwu.h, $$0 -> $$0 instanceof bwn $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bwo.d> o = bt.a(bwo.d.e, $$0 -> $$0 instanceof bwo $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bt<cbh> p = bt.a(jd.z.q(), $$0 -> $$0 instanceof cbe $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bvc.b> q = bt.a(bvc.b.f, $$0 -> $$0 instanceof bvc $$1 ? Optional.of($$1.gi()) : Optional.empty());
      public static final bt<bvm.b> r = bt.a(bvm.b.m, $$0 -> $$0 instanceof bvm $$1 ? Optional.of($$1.gl()) : Optional.empty());
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
      public static final Codec<br.a> t = arb.b(s.inverse()::get, s::get);
   }
}
