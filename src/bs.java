import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bs {
   Codec<bs> a = bs.b.t.dispatch(bs::a, $$0 -> $$0.a().codec());

   boolean a(bof var1, apa var2, @Nullable eov var3);

   bs.a a();

   static bs a(caq $$0) {
      return bs.b.f.a($$0);
   }

   static bs a(cax $$0) {
      return bs.b.g.a($$0);
   }

   public static record a(MapCodec<? extends bs> a) {
   }

   public static final class b {
      public static final bs.a a = new bs.a(MapCodec.unit(new bs() {
         @Override
         public boolean a(bof $$0, apa $$1, @Nullable eov $$2) {
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
      public static final bu<caq> f = bu.a(kh.ak, $$0 -> $$0 instanceof cap $$1 ? Optional.of($$1.gs()) : Optional.empty());
      public static final bu<cax> g = bu.a(kh.al, $$0 -> $$0 instanceof cce $$1 ? Optional.of($$1.A()) : Optional.empty());
      public static final bu<cbw.d> h = bu.a(cbw.d.f, $$0 -> $$0 instanceof cbw $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bu<cjv.b> i = bu.a(cjv.b.j, $$0 -> $$0 instanceof cjv $$1 ? Optional.of($$1.y()) : Optional.empty());
      public static final bu<caw.v> j = bu.a(caw.v.c, $$0 -> $$0 instanceof caw $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<caz.a> k = bu.a(caz.a.c, $$0 -> $$0 instanceof caz $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final bu<il<ceh>> l = bu.a(kh.l.r(), $$0 -> $$0 instanceof ceg $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final bu<cbg.g> m = bu.a(cbg.g.h, $$0 -> $$0 instanceof cbg $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final bu<ccx> n = bu.a(ccx.h, $$0 -> $$0 instanceof ccq $$1 ? Optional.of($$1.u()) : Optional.empty());
      public static final bu<ccr.d> o = bu.a(ccr.d.e, $$0 -> $$0 instanceof ccr $$1 ? Optional.of($$1.gx()) : Optional.empty());
      public static final bu<chs> p = bu.a(kh.y.q(), $$0 -> $$0 instanceof chp $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final bu<cbc.b> q = bu.a(cbc.b.f, $$0 -> $$0 instanceof cbc $$1 ? Optional.of($$1.gt()) : Optional.empty());
      public static final bu<cbm.b> r = bu.a(cbm.b.m, $$0 -> $$0 instanceof cbm $$1 ? Optional.of($$1.gw()) : Optional.empty());
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
      public static final Codec<bs.a> t = avu.a(s.inverse()::get, s::get);
   }
}
