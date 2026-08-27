import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(biw var1, akt var2, @Nullable ehh var3);

   br.a a();

   static br a(bvb $$0) {
      return br.b.f.a($$0);
   }

   static br a(bvi $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(biw $$0, akt $$1, @Nullable ehh $$2) {
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
      public static final bt<bvb> f = bt.a(jb.ak, $$0 -> $$0 instanceof bva $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bt<bvi> g = bt.a(jb.al, $$0 -> $$0 instanceof bwm $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bt<bwe.d> h = bt.a(bwe.d.f, $$0 -> $$0 instanceof bwe $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bt<cdt.b> i = bt.a(cdt.b.j, $$0 -> $$0 instanceof cdt $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bt<bvh.v> j = bt.a(bvh.v.c, $$0 -> $$0 instanceof bvh $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bvk.a> k = bt.a(bvk.a.c, $$0 -> $$0 instanceof bvk $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<he<byp>> l = bt.a(jb.m.r(), $$0 -> $$0 instanceof byo $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bvr.g> m = bt.a(bvr.g.h, $$0 -> $$0 instanceof bvr $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bt<bxf> n = bt.a(bxf.h, $$0 -> $$0 instanceof bwy $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bwz.d> o = bt.a(bwz.d.e, $$0 -> $$0 instanceof bwz $$1 ? Optional.of($$1.gq()) : Optional.empty());
      public static final bt<cbs> p = bt.a(jb.z.q(), $$0 -> $$0 instanceof cbp $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bvn.b> q = bt.a(bvn.b.f, $$0 -> $$0 instanceof bvn $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bt<bvx.b> r = bt.a(bvx.b.m, $$0 -> $$0 instanceof bvx $$1 ? Optional.of($$1.gp()) : Optional.empty());
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
      public static final Codec<br.a> t = arj.a(s.inverse()::get, s::get);
   }
}
