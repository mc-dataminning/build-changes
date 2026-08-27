import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(bkv var1, ami var2, @Nullable ejz var3);

   br.a a();

   static br a(bxa $$0) {
      return br.b.f.a($$0);
   }

   static br a(bxh $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(bkv $$0, ami $$1, @Nullable ejz $$2) {
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
      public static final bt<bxa> f = bt.a(kc.al, $$0 -> $$0 instanceof bwz $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bt<bxh> g = bt.a(kc.am, $$0 -> $$0 instanceof byl $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bt<byd.d> h = bt.a(byd.d.f, $$0 -> $$0 instanceof byd $$1 ? Optional.of($$1.gf()) : Optional.empty());
      public static final bt<cfs.b> i = bt.a(cfs.b.j, $$0 -> $$0 instanceof cfs $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bt<bxg.v> j = bt.a(bxg.v.c, $$0 -> $$0 instanceof bxg $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bt<bxj.a> k = bt.a(bxj.a.c, $$0 -> $$0 instanceof bxj $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bt<ig<cao>> l = bt.a(kc.m.r(), $$0 -> $$0 instanceof can $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bxq.g> m = bt.a(bxq.g.h, $$0 -> $$0 instanceof bxq $$1 ? Optional.of($$1.gf()) : Optional.empty());
      public static final bt<bze> n = bt.a(bze.h, $$0 -> $$0 instanceof byx $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bt<byy.d> o = bt.a(byy.d.e, $$0 -> $$0 instanceof byy $$1 ? Optional.of($$1.gr()) : Optional.empty());
      public static final bt<cdr> p = bt.a(kc.z.q(), $$0 -> $$0 instanceof cdo $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bxm.b> q = bt.a(bxm.b.f, $$0 -> $$0 instanceof bxm $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bt<bxw.b> r = bt.a(bxw.b.m, $$0 -> $$0 instanceof bxw $$1 ? Optional.of($$1.gq()) : Optional.empty());
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
      public static final Codec<br.a> t = asy.a(s.inverse()::get, s::get);
   }
}
