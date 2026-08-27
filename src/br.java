import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(bis var1, aks var2, @Nullable ehp var3);

   br.a a();

   static br a(bux $$0) {
      return br.b.f.a($$0);
   }

   static br a(bve $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(bis $$0, aks $$1, @Nullable ehp $$2) {
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
      public static final bt<bux> f = bt.a(jd.aj, $$0 -> $$0 instanceof buw $$1 ? Optional.of($$1.gk()) : Optional.empty());
      public static final bt<bve> g = bt.a(jd.ak, $$0 -> $$0 instanceof bwi $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bt<bwa.d> h = bt.a(bwa.d.f, $$0 -> $$0 instanceof bwa $$1 ? Optional.of($$1.gd()) : Optional.empty());
      public static final bt<cdp.b> i = bt.a(cdp.b.j, $$0 -> $$0 instanceof cdp $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bt<bvd.v> j = bt.a(bvd.v.c, $$0 -> $$0 instanceof bvd $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bvg.a> k = bt.a(bvg.a.c, $$0 -> $$0 instanceof bvg $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<hg<byl>> l = bt.a(jd.m.r(), $$0 -> $$0 instanceof byk $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bvn.g> m = bt.a(bvn.g.h, $$0 -> $$0 instanceof bvn $$1 ? Optional.of($$1.gd()) : Optional.empty());
      public static final bt<bxb> n = bt.a(bxb.h, $$0 -> $$0 instanceof bwu $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bwv.d> o = bt.a(bwv.d.e, $$0 -> $$0 instanceof bwv $$1 ? Optional.of($$1.gp()) : Optional.empty());
      public static final bt<cbo> p = bt.a(jd.z.q(), $$0 -> $$0 instanceof cbl $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bvj.b> q = bt.a(bvj.b.f, $$0 -> $$0 instanceof bvj $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bt<bvt.b> r = bt.a(bvt.b.m, $$0 -> $$0 instanceof bvt $$1 ? Optional.of($$1.go()) : Optional.empty());
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
      public static final Codec<br.a> t = arh.b(s.inverse()::get, s::get);
   }
}
