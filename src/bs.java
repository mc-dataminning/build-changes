import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bs {
   Codec<bs> a = bs.b.t.dispatch(bs::a, $$0 -> $$0.a().codec());

   boolean a(box var1, apf var2, @Nullable ept var3);

   bs.a a();

   static bs a(cbi $$0) {
      return bs.b.f.a($$0);
   }

   static bs a(cbp $$0) {
      return bs.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bs> a) {
   }

   public static final class b {
      public static final bs.a a = new bs.a(MapCodec.unit(new bs() {
         @Override
         public boolean a(box $$0, apf $$1, @Nullable ept $$2) {
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
      public static final bu<cbi> f = bu.a(ki.ak, $$0 -> $$0 instanceof cbh $$1 ? Optional.of($$1.gu()) : Optional.empty());
      public static final bu<cbp> g = bu.a(ki.al, $$0 -> $$0 instanceof ccw $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bu<cco.d> h = bu.a(cco.d.f, $$0 -> $$0 instanceof cco $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<ckr.b> i = bu.a(ckr.b.j, $$0 -> $$0 instanceof ckr $$1 ? Optional.of($$1.x()) : Optional.empty());
      public static final bu<cbo.v> j = bu.a(cbo.v.c, $$0 -> $$0 instanceof cbo $$1 ? Optional.of($$1.s()) : Optional.empty());
      public static final bu<cbr.a> k = bu.a(cbr.a.c, $$0 -> $$0 instanceof cbr $$1 ? Optional.of($$1.s()) : Optional.empty());
      public static final bu<il<cfa>> l = bu.a(ki.l.r(), $$0 -> $$0 instanceof cez $$1 ? Optional.of($$1.p()) : Optional.empty());
      public static final bu<cby.g> m = bu.a(cby.g.h, $$0 -> $$0 instanceof cby $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<cdp> n = bu.a(cdp.h, $$0 -> $$0 instanceof cdi $$1 ? Optional.of($$1.r()) : Optional.empty());
      public static final bu<cdj.d> o = bu.a(cdj.d.e, $$0 -> $$0 instanceof cdj $$1 ? Optional.of($$1.gz()) : Optional.empty());
      public static final bu<cim> p = bu.a(ki.y.q(), $$0 -> $$0 instanceof cij $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bu<cbu.b> q = bu.a(cbu.b.f, $$0 -> $$0 instanceof cbu $$1 ? Optional.of($$1.gv()) : Optional.empty());
      public static final bu<cce.b> r = bu.a(cce.b.m, $$0 -> $$0 instanceof cce $$1 ? Optional.of($$1.gy()) : Optional.empty());
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
      public static final Codec<bs.a> t = awe.a(s.inverse()::get, s::get);
   }
}
