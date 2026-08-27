import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface br {
   Codec<br> a = br.b.t.dispatch(br::a, $$0 -> $$0.a().codec());

   boolean a(bki var1, ama var2, @Nullable eji var3);

   br.a a();

   static br a(bwn $$0) {
      return br.b.f.a($$0);
   }

   static br a(bwu $$0) {
      return br.b.g.a($$0);
   }

   public static record a(MapCodec<? extends br> a) {
   }

   public static final class b {
      public static final br.a a = new br.a(MapCodec.unit(new br() {
         @Override
         public boolean a(bki $$0, ama $$1, @Nullable eji $$2) {
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
      public static final bt<bwn> f = bt.a(jy.al, $$0 -> $$0 instanceof bwm $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bt<bwu> g = bt.a(jy.am, $$0 -> $$0 instanceof bxy $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bt<bxq.d> h = bt.a(bxq.d.f, $$0 -> $$0 instanceof bxq $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bt<cff.b> i = bt.a(cff.b.j, $$0 -> $$0 instanceof cff $$1 ? Optional.of($$1.x()) : Optional.empty());
      public static final bt<bwt.v> j = bt.a(bwt.v.c, $$0 -> $$0 instanceof bwt $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<bww.a> k = bt.a(bww.a.c, $$0 -> $$0 instanceof bww $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<ib<cab>> l = bt.a(jy.m.r(), $$0 -> $$0 instanceof caa $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bt<bxd.g> m = bt.a(bxd.g.h, $$0 -> $$0 instanceof bxd $$1 ? Optional.of($$1.ge()) : Optional.empty());
      public static final bt<byr> n = bt.a(byr.h, $$0 -> $$0 instanceof byk $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final bt<byl.d> o = bt.a(byl.d.e, $$0 -> $$0 instanceof byl $$1 ? Optional.of($$1.gq()) : Optional.empty());
      public static final bt<cde> p = bt.a(jy.z.q(), $$0 -> $$0 instanceof cdb $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bt<bwz.b> q = bt.a(bwz.b.f, $$0 -> $$0 instanceof bwz $$1 ? Optional.of($$1.gm()) : Optional.empty());
      public static final bt<bxj.b> r = bt.a(bxj.b.m, $$0 -> $$0 instanceof bxj $$1 ? Optional.of($$1.gp()) : Optional.empty());
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
      public static final Codec<br.a> t = asq.a(s.inverse()::get, s::get);
   }
}
