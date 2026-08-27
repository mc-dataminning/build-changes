import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bp {
   Codec<bp> a = bp.b.t.dispatch(bp::a, $$0 -> $$0.a().codec());

   boolean a(bii var1, akk var2, @Nullable ehd var3);

   bp.a a();

   static bp a(bun $$0) {
      return bp.b.f.a($$0);
   }

   static bp a(buu $$0) {
      return bp.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bp> a) {
   }

   public static final class b {
      public static final bp.a a = new bp.a(MapCodec.unit(new bp() {
         @Override
         public boolean a(bii $$0, akk $$1, @Nullable ehd $$2) {
            return true;
         }

         @Override
         public bp.a a() {
            return bp.b.a;
         }
      }));
      public static final bp.a b = new bp.a(cf.b);
      public static final bp.a c = new bp.a(bt.c);
      public static final bp.a d = new bp.a(cp.c);
      public static final bp.a e = new bp.a(cw.b);
      public static final br<bun> f = br.a(jb.aj, $$0 -> $$0 instanceof bum $$1 ? Optional.of($$1.gh()) : Optional.empty());
      public static final br<buu> g = br.a(jb.ak, $$0 -> $$0 instanceof bvy $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final br<bvq.d> h = br.a(bvq.d.f, $$0 -> $$0 instanceof bvq $$1 ? Optional.of($$1.ga()) : Optional.empty());
      public static final br<cdf.b> i = br.a(cdf.b.j, $$0 -> $$0 instanceof cdf $$1 ? Optional.of($$1.v()) : Optional.empty());
      public static final br<but.v> j = br.a(but.v.c, $$0 -> $$0 instanceof but $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<buw.a> k = br.a(buw.a.c, $$0 -> $$0 instanceof buw $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<he<byb>> l = br.a(jb.m.r(), $$0 -> $$0 instanceof bya $$1 ? Optional.of($$1.j()) : Optional.empty());
      public static final br<bvd.g> m = br.a(bvd.g.h, $$0 -> $$0 instanceof bvd $$1 ? Optional.of($$1.ga()) : Optional.empty());
      public static final br<bwr> n = br.a(bwr.h, $$0 -> $$0 instanceof bwk $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<bwl.d> o = br.a(bwl.d.e, $$0 -> $$0 instanceof bwl $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final br<cbe> p = br.a(jb.z.q(), $$0 -> $$0 instanceof cbb $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final br<buz.b> q = br.a(buz.b.f, $$0 -> $$0 instanceof buz $$1 ? Optional.of($$1.gi()) : Optional.empty());
      public static final br<bvj.b> r = br.a(bvj.b.m, $$0 -> $$0 instanceof bvj $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final BiMap<String, bp.a> s = ImmutableBiMap.builder()
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
      public static final Codec<bp.a> t = aqy.b(s.inverse()::get, s::get);
   }
}
