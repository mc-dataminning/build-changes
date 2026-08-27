import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bs {
   Codec<bs> a = bs.b.t.dispatch(bs::a, $$0 -> $$0.a().codec());

   boolean a(bnq var1, aow var2, @Nullable enz var3);

   bs.a a();

   static bs a(cab $$0) {
      return bs.b.f.a($$0);
   }

   static bs a(cai $$0) {
      return bs.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bs> a) {
   }

   public static final class b {
      public static final bs.a a = new bs.a(MapCodec.unit(new bs() {
         @Override
         public boolean a(bnq $$0, aow $$1, @Nullable enz $$2) {
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
      public static final bu<cab> f = bu.a(kf.ak, $$0 -> $$0 instanceof caa $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bu<cai> g = bu.a(kf.al, $$0 -> $$0 instanceof cbp $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bu<cbh.d> h = bu.a(cbh.d.f, $$0 -> $$0 instanceof cbh $$1 ? Optional.of($$1.gg()) : Optional.empty());
      public static final bu<cjg.b> i = bu.a(cjg.b.j, $$0 -> $$0 instanceof cjg $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bu<cah.v> j = bu.a(cah.v.c, $$0 -> $$0 instanceof cah $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<cak.a> k = bu.a(cak.a.c, $$0 -> $$0 instanceof cak $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<ij<cds>> l = bu.a(kf.l.r(), $$0 -> $$0 instanceof cdr $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bu<car.g> m = bu.a(car.g.h, $$0 -> $$0 instanceof car $$1 ? Optional.of($$1.gg()) : Optional.empty());
      public static final bu<cci> n = bu.a(cci.h, $$0 -> $$0 instanceof ccb $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<ccc.d> o = bu.a(ccc.d.e, $$0 -> $$0 instanceof ccc $$1 ? Optional.of($$1.gs()) : Optional.empty());
      public static final bu<chd> p = bu.a(kf.y.q(), $$0 -> $$0 instanceof cha $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bu<can.b> q = bu.a(can.b.f, $$0 -> $$0 instanceof can $$1 ? Optional.of($$1.go()) : Optional.empty());
      public static final bu<cax.b> r = bu.a(cax.b.m, $$0 -> $$0 instanceof cax $$1 ? Optional.of($$1.gr()) : Optional.empty());
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
      public static final Codec<bs.a> t = avq.a(s.inverse()::get, s::get);
   }
}
