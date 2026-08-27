import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(biq var1, akr var2, @Nullable ehn var3);

   br.a a();

   static br a(buv $$0) {
      return br.b.f.a($$0);
   }

   static br a(bvc $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(biq $$0, akr $$1, @Nullable ehn $$2) {
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
      public static final bt<buv> f = bt.a(jd.aj, $$0 -> $$0 instanceof buu $$1 ? Optional.of($$1.gk()) : Optional.empty());
      public static final bt<bvc> g = bt.a(jd.ak, $$0 -> $$0 instanceof bwg $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bt<bvy.d> h = bt.a(bvy.d.f, $$0 -> $$0 instanceof bvy $$1 ? Optional.of($$1.gd()) : Optional.empty());
      public static final bt<cdn.b> i = bt.a(cdn.b.j, $$0 -> $$0 instanceof cdn $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bt<bvb.v> j = bt.a(bvb.v.c, $$0 -> $$0 instanceof bvb $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bve.a> k = bt.a(bve.a.c, $$0 -> $$0 instanceof bve $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<hg<byj>> l = bt.a(jd.m.r(), $$0 -> $$0 instanceof byi $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bvl.g> m = bt.a(bvl.g.h, $$0 -> $$0 instanceof bvl $$1 ? Optional.of($$1.gd()) : Optional.empty());
      public static final bt<bwz> n = bt.a(bwz.h, $$0 -> $$0 instanceof bws $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bwt.d> o = bt.a(bwt.d.e, $$0 -> $$0 instanceof bwt $$1 ? Optional.of($$1.gp()) : Optional.empty());
      public static final bt<cbm> p = bt.a(jd.z.q(), $$0 -> $$0 instanceof cbj $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bvh.b> q = bt.a(bvh.b.f, $$0 -> $$0 instanceof bvh $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bt<bvr.b> r = bt.a(bvr.b.m, $$0 -> $$0 instanceof bvr $$1 ? Optional.of($$1.go()) : Optional.empty());
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
      public static final Codec<br.a> t = arg.b(s.inverse()::get, s::get);
   }
}
