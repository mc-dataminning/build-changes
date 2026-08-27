import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bs {
   Codec<bs> a = bs.b.t.dispatch(bs::a, $$0 -> $$0.a().codec());

   boolean a(bpv var1, aps var2, @Nullable esa var3);

   bs.a a();

   static bs a(cch $$0) {
      return bs.b.f.a($$0);
   }

   static bs a(cco $$0) {
      return bs.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bs> a) {
   }

   public static final class b {
      public static final bs.a a = new bs.a(MapCodec.unit(new bs() {
         @Override
         public boolean a(bpv $$0, aps $$1, @Nullable esa $$2) {
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
      public static final bu<cch> f = bu.a(kr.ak, $$0 -> $$0 instanceof ccg $$1 ? Optional.of($$1.gu()) : Optional.empty());
      public static final bu<cco> g = bu.a(kr.al, $$0 -> $$0 instanceof cdv $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bu<cdn.d> h = bu.a(cdn.d.f, $$0 -> $$0 instanceof cdn $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<clq.b> i = bu.a(clq.b.j, $$0 -> $$0 instanceof clq $$1 ? Optional.of($$1.x()) : Optional.empty());
      public static final bu<ccn.v> j = bu.a(ccn.v.c, $$0 -> $$0 instanceof ccn $$1 ? Optional.of($$1.u()) : Optional.empty());
      public static final bu<ccq.a> k = bu.a(ccq.a.c, $$0 -> $$0 instanceof ccq $$1 ? Optional.of($$1.u()) : Optional.empty());
      public static final bu<il<cfz>> l = bu.a(kr.l.r(), $$0 -> $$0 instanceof cfy $$1 ? Optional.of($$1.p()) : Optional.empty());
      public static final bu<ccx.g> m = bu.a(ccx.g.h, $$0 -> $$0 instanceof ccx $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<ceo> n = bu.a(ceo.h, $$0 -> $$0 instanceof ceh $$1 ? Optional.of($$1.r()) : Optional.empty());
      public static final bu<cei.d> o = bu.a(cei.d.e, $$0 -> $$0 instanceof cei $$1 ? Optional.of($$1.gz()) : Optional.empty());
      public static final bu<cjl> p = bu.a(kr.y.q(), $$0 -> $$0 instanceof cji $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bu<cct.b> q = bu.a(cct.b.f, $$0 -> $$0 instanceof cct $$1 ? Optional.of($$1.gv()) : Optional.empty());
      public static final bu<cdd.b> r = bu.a(cdd.b.m, $$0 -> $$0 instanceof cdd $$1 ? Optional.of($$1.gy()) : Optional.empty());
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
      public static final Codec<bs.a> t = aws.a(s.inverse()::get, s::get);
   }
}
