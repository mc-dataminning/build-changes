import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bp {
   Codec<bp> a = bp.b.t.dispatch(bp::a, $$0 -> $$0.a().codec());

   boolean a(bii var1, akk var2, @Nullable ehe var3);

   bp.a a();

   static bp a(buo $$0) {
      return bp.b.f.a($$0);
   }

   static bp a(buv $$0) {
      return bp.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bp> a) {
   }

   public static final class b {
      public static final bp.a a = new bp.a(MapCodec.unit(new bp() {
         @Override
         public boolean a(bii $$0, akk $$1, @Nullable ehe $$2) {
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
      public static final br<buo> f = br.a(jb.aj, $$0 -> $$0 instanceof bun $$1 ? Optional.of($$1.gg()) : Optional.empty());
      public static final br<buv> g = br.a(jb.ak, $$0 -> $$0 instanceof bvz $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final br<bvr.d> h = br.a(bvr.d.f, $$0 -> $$0 instanceof bvr $$1 ? Optional.of($$1.fZ()) : Optional.empty());
      public static final br<cdg.b> i = br.a(cdg.b.j, $$0 -> $$0 instanceof cdg $$1 ? Optional.of($$1.v()) : Optional.empty());
      public static final br<buu.v> j = br.a(buu.v.c, $$0 -> $$0 instanceof buu $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<bux.a> k = br.a(bux.a.c, $$0 -> $$0 instanceof bux $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<he<byc>> l = br.a(jb.m.r(), $$0 -> $$0 instanceof byb $$1 ? Optional.of($$1.j()) : Optional.empty());
      public static final br<bve.h> m = br.a(bve.h.h, $$0 -> $$0 instanceof bve $$1 ? Optional.of($$1.fZ()) : Optional.empty());
      public static final br<bws> n = br.a(bws.h, $$0 -> $$0 instanceof bwl $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<bwm.d> o = br.a(bwm.d.e, $$0 -> $$0 instanceof bwm $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final br<cbf> p = br.a(jb.z.q(), $$0 -> $$0 instanceof cbc $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final br<bva.b> q = br.a(bva.b.f, $$0 -> $$0 instanceof bva $$1 ? Optional.of($$1.gh()) : Optional.empty());
      public static final br<bvk.b> r = br.a(bvk.b.m, $$0 -> $$0 instanceof bvk $$1 ? Optional.of($$1.gk()) : Optional.empty());
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
