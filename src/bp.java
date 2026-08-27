import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bp {
   bp a = new bp() {
      @Override
      public boolean a(big $$0, aki $$1, @Nullable ehf $$2) {
         return true;
      }

      @Override
      public JsonObject a() {
         return new JsonObject();
      }

      @Override
      public bp.a c() {
         return bp.b.a;
      }
   };

   static bp a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = arf.m($$0, "type_specific");
         String $$2 = arf.a($$1, "type", null);
         if ($$2 == null) {
            return a;
         } else {
            bp.a $$3 = (bp.a)bp.b.s.get($$2);
            if ($$3 == null) {
               throw new JsonSyntaxException("Unknown sub-predicate type: " + $$2);
            } else {
               return $$3.deserialize($$1);
            }
         }
      } else {
         return a;
      }
   }

   boolean a(big var1, aki var2, @Nullable ehf var3);

   JsonObject a();

   default JsonElement b() {
      if (this.c() == bp.b.a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = this.a();
         String $$1 = (String)bp.b.s.inverse().get(this.c());
         $$0.addProperty("type", $$1);
         return $$0;
      }
   }

   bp.a c();

   static bp a(bum $$0) {
      return bp.b.f.a($$0);
   }

   static bp a(but $$0) {
      return bp.b.g.a($$0);
   }

   public interface a {
      bp deserialize(JsonObject var1);
   }

   public static final class b {
      public static final bp.a a = $$0 -> bp.a;
      public static final bp.a b = cf::a;
      public static final bp.a c = bt::a;
      public static final bp.a d = cp::a;
      public static final bp.a e = cx::a;
      public static final br<bum> f = br.a(jc.aj, $$0 -> $$0 instanceof bul $$1 ? Optional.of($$1.gg()) : Optional.empty());
      public static final br<but> g = br.a(jc.ak, $$0 -> $$0 instanceof bvx $$1 ? Optional.of($$1.t()) : Optional.empty());
      public static final br<bvp.d> h = br.a(bvp.d.f, $$0 -> $$0 instanceof bvp $$1 ? Optional.of($$1.fZ()) : Optional.empty());
      public static final br<cde.b> i = br.a(cde.b.j, $$0 -> $$0 instanceof cde $$1 ? Optional.of($$1.v()) : Optional.empty());
      public static final br<bus.v> j = br.a(bus.v.c, $$0 -> $$0 instanceof bus $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<buv.a> k = br.a(buv.a.c, $$0 -> $$0 instanceof buv $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<hf<bya>> l = br.a(jc.m.r(), $$0 -> $$0 instanceof bxz $$1 ? Optional.of($$1.j()) : Optional.empty());
      public static final br<bvc.h> m = br.a(bvc.h.h, $$0 -> $$0 instanceof bvc $$1 ? Optional.of($$1.fZ()) : Optional.empty());
      public static final br<bwq> n = br.a(bwq.h, $$0 -> $$0 instanceof bwj $$1 ? Optional.of($$1.q()) : Optional.empty());
      public static final br<bwk.d> o = br.a(bwk.d.e, $$0 -> $$0 instanceof bwk $$1 ? Optional.of($$1.gl()) : Optional.empty());
      public static final br<cbd> p = br.a(jc.z.q(), $$0 -> $$0 instanceof cba $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final br<buy.b> q = br.a(buy.b.f, $$0 -> $$0 instanceof buy $$1 ? Optional.of($$1.gh()) : Optional.empty());
      public static final br<bvi.b> r = br.a(bvi.b.m, $$0 -> $$0 instanceof bvi $$1 ? Optional.of($$1.gk()) : Optional.empty());
      public static final BiMap<String, bp.a> s = ImmutableBiMap.builder()
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
   }
}
