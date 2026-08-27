import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(bkq var1, ame var2, @Nullable eju var3);

   br.a a();

   static br a(bwv $$0) {
      return br.b.f.a($$0);
   }

   static br a(bxc $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(bkq $$0, ame $$1, @Nullable eju $$2) {
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
      public static final bt<bwv> f = bt.a(jy.al, $$0 -> $$0 instanceof bwu $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bt<bxc> g = bt.a(jy.am, $$0 -> $$0 instanceof byg $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bt<bxy.d> h = bt.a(bxy.d.f, $$0 -> $$0 instanceof bxy $$1 ? Optional.of($$1.gf()) : Optional.empty());
      public static final bt<cfn.b> i = bt.a(cfn.b.j, $$0 -> $$0 instanceof cfn $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bt<bxb.v> j = bt.a(bxb.v.c, $$0 -> $$0 instanceof bxb $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bt<bxe.a> k = bt.a(bxe.a.c, $$0 -> $$0 instanceof bxe $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bt<ib<caj>> l = bt.a(jy.m.r(), $$0 -> $$0 instanceof cai $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bxl.g> m = bt.a(bxl.g.h, $$0 -> $$0 instanceof bxl $$1 ? Optional.of($$1.gf()) : Optional.empty());
      public static final bt<byz> n = bt.a(byz.h, $$0 -> $$0 instanceof bys $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bt<byt.d> o = bt.a(byt.d.e, $$0 -> $$0 instanceof byt $$1 ? Optional.of($$1.gr()) : Optional.empty());
      public static final bt<cdm> p = bt.a(jy.z.q(), $$0 -> $$0 instanceof cdj $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bxh.b> q = bt.a(bxh.b.f, $$0 -> $$0 instanceof bxh $$1 ? Optional.of($$1.gn()) : Optional.empty());
      public static final bt<bxr.b> r = bt.a(bxr.b.m, $$0 -> $$0 instanceof bxr $$1 ? Optional.of($$1.gq()) : Optional.empty());
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
      public static final Codec<br.a> t = asu.a(s.inverse()::get, s::get);
   }
}
