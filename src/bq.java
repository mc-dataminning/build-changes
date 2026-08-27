import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bq {
   Codec<bq> a = bq.b.t.dispatch(bq::a, $$0 -> $$0.a().codec());

   boolean a(blw var1, ane var2, @Nullable emc var3);

   bq.a a();

   static bq a(byg $$0) {
      return bq.b.f.a($$0);
   }

   static bq a(byn $$0) {
      return bq.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bq> a) {
   }

   public static final class b {
      public static final bq.a a = new bq.a(MapCodec.unit(new bq() {
         @Override
         public boolean a(blw $$0, ane $$1, @Nullable emc $$2) {
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
      public static final bs<byg> f = bs.a(kd.ak, $$0 -> $$0 instanceof byf $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bs<byn> g = bs.a(kd.al, $$0 -> $$0 instanceof bzu $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bs<bzm.d> h = bs.a(bzm.d.f, $$0 -> $$0 instanceof bzm $$1 ? Optional.of($$1.gf()) : Optional.empty());
      public static final bs<chk.b> i = bs.a(chk.b.j, $$0 -> $$0 instanceof chk $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bs<bym.v> j = bs.a(bym.v.c, $$0 -> $$0 instanceof bym $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<byp.a> k = bs.a(byp.a.c, $$0 -> $$0 instanceof byp $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<ih<cbx>> l = bs.a(kd.l.r(), $$0 -> $$0 instanceof cbw $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bs<byw.g> m = bs.a(byw.g.h, $$0 -> $$0 instanceof byw $$1 ? Optional.of($$1.gf()) : Optional.empty());
      public static final bs<can> n = bs.a(can.h, $$0 -> $$0 instanceof cag $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bs<cah.d> o = bs.a(cah.d.e, $$0 -> $$0 instanceof cah $$1 ? Optional.of($$1.gr()) : Optional.empty());
      public static final bs<cfi> p = bs.a(kd.y.q(), $$0 -> $$0 instanceof cff $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bs<bys.b> q = bs.a(bys.b.f, $$0 -> $$0 instanceof bys $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bs<bzc.b> r = bs.a(bzc.b.m, $$0 -> $$0 instanceof bzc $$1 ? Optional.of($$1.gq()) : Optional.empty());
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
      public static final Codec<bq.a> t = atx.a(s.inverse()::get, s::get);
   }
}
