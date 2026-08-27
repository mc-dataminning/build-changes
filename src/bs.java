import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bs {
   Codec<bs> a = bs.b.t.dispatch(bs::a, $$0 -> $$0.a().codec());

   boolean a(bno var1, aov var2, @Nullable ens var3);

   bs.a a();

   static bs a(bzx $$0) {
      return bs.b.f.a($$0);
   }

   static bs a(cae $$0) {
      return bs.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bs> a) {
   }

   public static final class b {
      public static final bs.a a = new bs.a(MapCodec.unit(new bs() {
         @Override
         public boolean a(bno $$0, aov $$1, @Nullable ens $$2) {
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
      public static final bu<bzx> f = bu.a(kf.ak, $$0 -> $$0 instanceof bzw $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<cae> g = bu.a(kf.al, $$0 -> $$0 instanceof cbl $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bu<cbd.d> h = bu.a(cbd.d.f, $$0 -> $$0 instanceof cbd $$1 ? Optional.of($$1.gg()) : Optional.empty());
      public static final bu<cjc.b> i = bu.a(cjc.b.j, $$0 -> $$0 instanceof cjc $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bu<cad.v> j = bu.a(cad.v.c, $$0 -> $$0 instanceof cad $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<cag.a> k = bu.a(cag.a.c, $$0 -> $$0 instanceof cag $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<ij<cdo>> l = bu.a(kf.l.r(), $$0 -> $$0 instanceof cdn $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bu<can.g> m = bu.a(can.g.h, $$0 -> $$0 instanceof can $$1 ? Optional.of($$1.gg()) : Optional.empty());
      public static final bu<cce> n = bu.a(cce.h, $$0 -> $$0 instanceof cbx $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<cby.d> o = bu.a(cby.d.e, $$0 -> $$0 instanceof cby $$1 ? Optional.of($$1.gs()) : Optional.empty());
      public static final bu<cgz> p = bu.a(kf.y.q(), $$0 -> $$0 instanceof cgw $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bu<caj.b> q = bu.a(caj.b.f, $$0 -> $$0 instanceof caj $$1 ? Optional.of($$1.go()) : Optional.empty());
      public static final bu<cat.b> r = bu.a(cat.b.m, $$0 -> $$0 instanceof cat $$1 ? Optional.of($$1.gr()) : Optional.empty());
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
      public static final Codec<bs.a> t = avp.a(s.inverse()::get, s::get);
   }
}
