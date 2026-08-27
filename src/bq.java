import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bq {
   Codec<bq> a = bq.b.t.dispatch(bq::a, $$0 -> $$0.a().codec());

   boolean a(blf var1, amp var2, @Nullable elb var3);

   bq.a a();

   static bq a(bxm $$0) {
      return bq.b.f.a($$0);
   }

   static bq a(bxt $$0) {
      return bq.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bq> a) {
   }

   public static final class b {
      public static final bq.a a = new bq.a(MapCodec.unit(new bq() {
         @Override
         public boolean a(blf $$0, amp $$1, @Nullable elb $$2) {
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
      public static final bs<bxm> f = bs.a(kb.ak, $$0 -> $$0 instanceof bxl $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bs<bxt> g = bs.a(kb.al, $$0 -> $$0 instanceof byx $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bs<byp.d> h = bs.a(byp.d.f, $$0 -> $$0 instanceof byp $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<cgl.b> i = bs.a(cgl.b.j, $$0 -> $$0 instanceof cgl $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bs<bxs.v> j = bs.a(bxs.v.c, $$0 -> $$0 instanceof bxs $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<bxv.a> k = bs.a(bxv.a.c, $$0 -> $$0 instanceof bxv $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<ie<cba>> l = bs.a(kb.l.r(), $$0 -> $$0 instanceof caz $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bs<byc.g> m = bs.a(byc.g.h, $$0 -> $$0 instanceof byc $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<bzq> n = bs.a(bzq.h, $$0 -> $$0 instanceof bzj $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<bzk.d> o = bs.a(bzk.d.e, $$0 -> $$0 instanceof bzk $$1 ? Optional.of($$1.gq()) : Optional.empty());
      public static final bs<cej> p = bs.a(kb.y.q(), $$0 -> $$0 instanceof ceg $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bs<bxy.b> q = bs.a(bxy.b.f, $$0 -> $$0 instanceof bxy $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bs<byi.b> r = bs.a(byi.b.m, $$0 -> $$0 instanceof byi $$1 ? Optional.of($$1.gp()) : Optional.empty());
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
      public static final Codec<bq.a> t = atg.a(s.inverse()::get, s::get);
   }
}
