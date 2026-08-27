import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bq {
   Codec<bq> a = bq.b.t.dispatch(bq::a, $$0 -> $$0.a().codec());

   boolean a(blu var1, and var2, @Nullable els var3);

   bq.a a();

   static bq a(byb $$0) {
      return bq.b.f.a($$0);
   }

   static bq a(byi $$0) {
      return bq.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bq> a) {
   }

   public static final class b {
      public static final bq.a a = new bq.a(MapCodec.unit(new bq() {
         @Override
         public boolean a(blu $$0, and $$1, @Nullable els $$2) {
            return true;
         }

         @Override
         public bq.a a() {
            return bq.b.a;
         }
      }));
      public static final bq.a b = new bq.a(cg.b);
      public static final bq.a c = new bq.a(bu.c);
      public static final bq.a d = new bq.a(cq.c);
      public static final bq.a e = new bq.a(cx.b);
      public static final bs<byb> f = bs.a(kd.ak, $$0 -> $$0 instanceof bya $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bs<byi> g = bs.a(kd.al, $$0 -> $$0 instanceof bzm $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bs<bze.d> h = bs.a(bze.d.f, $$0 -> $$0 instanceof bze $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<chb.b> i = bs.a(chb.b.j, $$0 -> $$0 instanceof chb $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bs<byh.v> j = bs.a(byh.v.c, $$0 -> $$0 instanceof byh $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<byk.a> k = bs.a(byk.a.c, $$0 -> $$0 instanceof byk $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<ih<cbp>> l = bs.a(kd.l.r(), $$0 -> $$0 instanceof cbo $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bs<byr.g> m = bs.a(byr.g.h, $$0 -> $$0 instanceof byr $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<caf> n = bs.a(caf.h, $$0 -> $$0 instanceof bzy $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<bzz.d> o = bs.a(bzz.d.e, $$0 -> $$0 instanceof bzz $$1 ? Optional.of($$1.gq()) : Optional.empty());
      public static final bs<cez> p = bs.a(kd.y.q(), $$0 -> $$0 instanceof cew $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bs<byn.b> q = bs.a(byn.b.f, $$0 -> $$0 instanceof byn $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bs<byx.b> r = bs.a(byx.b.m, $$0 -> $$0 instanceof byx $$1 ? Optional.of($$1.gp()) : Optional.empty());
      public static final BiMap<String, bq.a> s = ImmutableBiMap.builder()
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
      public static final Codec<bq.a> t = atv.a(s.inverse()::get, s::get);
   }
}
