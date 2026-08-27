import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bs {
   Codec<bs> a = bs.b.t.dispatch(bs::a, $$0 -> $$0.a().codec());

   boolean a(bow var1, apf var2, @Nullable epr var3);

   bs.a a();

   static bs a(cbh $$0) {
      return bs.b.f.a($$0);
   }

   static bs a(cbo $$0) {
      return bs.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bs> a) {
   }

   public static final class b {
      public static final bs.a a = new bs.a(MapCodec.unit(new bs() {
         @Override
         public boolean a(bow $$0, apf $$1, @Nullable epr $$2) {
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
      public static final bu<cbh> f = bu.a(ki.ak, $$0 -> $$0 instanceof cbg $$1 ? Optional.of($$1.gu()) : Optional.empty());
      public static final bu<cbo> g = bu.a(ki.al, $$0 -> $$0 instanceof ccv $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bu<ccn.d> h = bu.a(ccn.d.f, $$0 -> $$0 instanceof ccn $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<ckp.b> i = bu.a(ckp.b.j, $$0 -> $$0 instanceof ckp $$1 ? Optional.of($$1.x()) : Optional.empty());
      public static final bu<cbn.v> j = bu.a(cbn.v.c, $$0 -> $$0 instanceof cbn $$1 ? Optional.of($$1.s()) : Optional.empty());
      public static final bu<cbq.a> k = bu.a(cbq.a.c, $$0 -> $$0 instanceof cbq $$1 ? Optional.of($$1.s()) : Optional.empty());
      public static final bu<il<cez>> l = bu.a(ki.l.r(), $$0 -> $$0 instanceof cey $$1 ? Optional.of($$1.p()) : Optional.empty());
      public static final bu<cbx.g> m = bu.a(cbx.g.h, $$0 -> $$0 instanceof cbx $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<cdo> n = bu.a(cdo.h, $$0 -> $$0 instanceof cdh $$1 ? Optional.of($$1.r()) : Optional.empty());
      public static final bu<cdi.d> o = bu.a(cdi.d.e, $$0 -> $$0 instanceof cdi $$1 ? Optional.of($$1.gz()) : Optional.empty());
      public static final bu<cik> p = bu.a(ki.y.q(), $$0 -> $$0 instanceof cih $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bu<cbt.b> q = bu.a(cbt.b.f, $$0 -> $$0 instanceof cbt $$1 ? Optional.of($$1.gv()) : Optional.empty());
      public static final bu<ccd.b> r = bu.a(ccd.b.m, $$0 -> $$0 instanceof ccd $$1 ? Optional.of($$1.gy()) : Optional.empty());
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
