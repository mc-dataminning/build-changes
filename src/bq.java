import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bq {
   Codec<bq> a = bq.b.t.dispatch(bq::a, $$0 -> $$0.a().codec());

   boolean a(blp var1, amz var2, @Nullable elm var3);

   bq.a a();

   static bq a(bxw $$0) {
      return bq.b.f.a($$0);
   }

   static bq a(byd $$0) {
      return bq.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bq> a) {
   }

   public static final class b {
      public static final bq.a a = new bq.a(MapCodec.unit(new bq() {
         @Override
         public boolean a(blp $$0, amz $$1, @Nullable elm $$2) {
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
      public static final bs<bxw> f = bs.a(kd.ak, $$0 -> $$0 instanceof bxv $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bs<byd> g = bs.a(kd.al, $$0 -> $$0 instanceof bzh $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bs<byz.d> h = bs.a(byz.d.f, $$0 -> $$0 instanceof byz $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<cgv.b> i = bs.a(cgv.b.j, $$0 -> $$0 instanceof cgv $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bs<byc.v> j = bs.a(byc.v.c, $$0 -> $$0 instanceof byc $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<byf.a> k = bs.a(byf.a.c, $$0 -> $$0 instanceof byf $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<ih<cbk>> l = bs.a(kd.l.r(), $$0 -> $$0 instanceof cbj $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bs<bym.g> m = bs.a(bym.g.h, $$0 -> $$0 instanceof bym $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bs<caa> n = bs.a(caa.h, $$0 -> $$0 instanceof bzt $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<bzu.d> o = bs.a(bzu.d.e, $$0 -> $$0 instanceof bzu $$1 ? Optional.of($$1.gq()) : Optional.empty());
      public static final bs<cet> p = bs.a(kd.y.q(), $$0 -> $$0 instanceof ceq $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bs<byi.b> q = bs.a(byi.b.f, $$0 -> $$0 instanceof byi $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bs<bys.b> r = bs.a(bys.b.m, $$0 -> $$0 instanceof bys $$1 ? Optional.of($$1.gp()) : Optional.empty());
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
      public static final Codec<bq.a> t = atq.a(s.inverse()::get, s::get);
   }
}
