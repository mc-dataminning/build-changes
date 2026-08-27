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
      public boolean a(bfj $$0, aif $$1, @Nullable eei $$2) {
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
         JsonObject $$1 = aor.m($$0, "type_specific");
         String $$2 = aor.a($$1, "type", null);
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

   boolean a(bfj var1, aif var2, @Nullable eei var3);

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

   static bp a(brp $$0) {
      return bp.b.f.a($$0);
   }

   static bp a(brw $$0) {
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
      public static final br<brp> f = br.a(jb.aj, $$0 -> $$0 instanceof bro $$1 ? Optional.of($$1.gf()) : Optional.empty());
      public static final br<brw> g = br.a(jb.ak, $$0 -> $$0 instanceof bta $$1 ? Optional.of($$1.w()) : Optional.empty());
      public static final br<bss.d> h = br.a(bss.d.f, $$0 -> $$0 instanceof bss $$1 ? Optional.of($$1.fY()) : Optional.empty());
      public static final br<cah.b> i = br.a(cah.b.j, $$0 -> $$0 instanceof cah $$1 ? Optional.of($$1.v()) : Optional.empty());
      public static final br<brv.v> j = br.a(brv.v.c, $$0 -> $$0 instanceof brv $$1 ? Optional.of($$1.r()) : Optional.empty());
      public static final br<bry.a> k = br.a(bry.a.c, $$0 -> $$0 instanceof bry $$1 ? Optional.of($$1.r()) : Optional.empty());
      public static final br<he<bvd>> l = br.a(jb.m.r(), $$0 -> $$0 instanceof bvc $$1 ? Optional.of($$1.j()) : Optional.empty());
      public static final br<bsf.h> m = br.a(bsf.h.h, $$0 -> $$0 instanceof bsf $$1 ? Optional.of($$1.fY()) : Optional.empty());
      public static final br<btt> n = br.a(btt.h, $$0 -> $$0 instanceof btm $$1 ? Optional.of($$1.r()) : Optional.empty());
      public static final br<btn.d> o = br.a(btn.d.e, $$0 -> $$0 instanceof btn $$1 ? Optional.of($$1.gk()) : Optional.empty());
      public static final br<byg> p = br.a(jb.z.q(), $$0 -> $$0 instanceof byd $$1 ? Optional.of($$1.a()) : Optional.empty());
      public static final br<bsb.b> q = br.a(bsb.b.f, $$0 -> $$0 instanceof bsb $$1 ? Optional.of($$1.gg()) : Optional.empty());
      public static final br<bsl.b> r = br.a(bsl.b.m, $$0 -> $$0 instanceof bsl $$1 ? Optional.of($$1.gj()) : Optional.empty());
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
