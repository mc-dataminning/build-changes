import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bq {
   Codec<bq> a = bq.b.t.dispatch(bq::a, $$0 -> $$0.a().codec());

   boolean a(blv var1, and var2, @Nullable elt var3);

   bq.a a();

   static bq a(byc $$0) {
      return bq.b.f.a($$0);
   }

   static bq a(byj $$0) {
      return bq.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bq> a) {
   }

   public static final class b {
      public static final bq.a a = new bq.a(MapCodec.unit(new bq() {
         @Override
         public boolean a(blv $$0, and $$1, @Nullable elt $$2) {
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
      public static final bs<byc> f = bs.a(kd.ak, $$0 -> $$0 instanceof byb $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bs<byj> g = bs.a(kd.al, $$0 -> $$0 instanceof bzn $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bs<bzf.d> h = bs.a(bzf.d.f, $$0 -> $$0 instanceof bzf $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<chc.b> i = bs.a(chc.b.j, $$0 -> $$0 instanceof chc $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bs<byi.v> j = bs.a(byi.v.c, $$0 -> $$0 instanceof byi $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<byl.a> k = bs.a(byl.a.c, $$0 -> $$0 instanceof byl $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<ih<cbq>> l = bs.a(kd.l.r(), $$0 -> $$0 instanceof cbp $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bs<bys.g> m = bs.a(bys.g.h, $$0 -> $$0 instanceof bys $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<cag> n = bs.a(cag.h, $$0 -> $$0 instanceof bzz $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<caa.d> o = bs.a(caa.d.e, $$0 -> $$0 instanceof caa $$1 ? Optional.of($$1.gq()) : Optional.empty());
      public static final bs<cfa> p = bs.a(kd.y.q(), $$0 -> $$0 instanceof cex $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bs<byo.b> q = bs.a(byo.b.f, $$0 -> $$0 instanceof byo $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bs<byy.b> r = bs.a(byy.b.m, $$0 -> $$0 instanceof byy $$1 ? Optional.of($$1.gp()) : Optional.empty());
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
      public static final Codec<bq.a> t = atw.a(s.inverse()::get, s::get);
   }
}
