import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.Set;
import org.slf4j.Logger;

public class edq extends edv {
   static final Logger h = LogUtils.getLogger();
   public static final apy<dux> a = apu.e;
   public static final String b = "mansion";
   public static final ebi.a c = ebi.a.i;
   public static final byte d = 2;
   public static final int e = 50;
   public static final boolean f = true;
   final apy<dux> i;
   final ebi.a j;
   final byte k;
   final int l;
   final boolean m;

   edq(efh[] $$0, apy<dux> $$1, ebi.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = $$4;
      this.m = $$5;
   }

   @Override
   public edx b() {
      return edy.l;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.f);
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if (!$$0.a(ciz.tp)) {
         return $$0;
      } else {
         ehf $$2 = $$1.c(eet.f);
         if ($$2 != null) {
            aki $$3 = $$1.d();
            gv $$4 = $$3.a(this.i, gv.a($$2), this.l, this.m);
            if ($$4 != null) {
               ciw $$5 = cjd.a($$3, $$4.u(), $$4.w(), this.k, true, true);
               cjd.a($$3, $$5);
               ebl.a($$5, $$4, "+", this.j);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static edq.a c() {
      return new edq.a();
   }

   public static class a extends edv.a<edq.a> {
      private apy<dux> a;
      private ebi.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = edq.a;
         this.b = edq.c;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected edq.a a() {
         return this;
      }

      public edq.a a(apy<dux> $$0) {
         this.a = $$0;
         return this;
      }

      public edq.a a(ebi.a $$0) {
         this.b = $$0;
         return this;
      }

      public edq.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public edq.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public edq.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public edw b() {
         return new edq(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }

   public static class b extends edv.c<edq> {
      public void a(JsonObject $$0, edq $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.i.equals(edq.a)) {
            $$0.addProperty("destination", $$1.i.b().toString());
         }

         if ($$1.j != edq.c) {
            $$0.add("decoration", $$2.serialize($$1.j.toString().toLowerCase(Locale.ROOT)));
         }

         if ($$1.k != 2) {
            $$0.addProperty("zoom", $$1.k);
         }

         if ($$1.l != 50) {
            $$0.addProperty("search_radius", $$1.l);
         }

         if (!$$1.m) {
            $$0.addProperty("skip_existing_chunks", $$1.m);
         }
      }

      public edq a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         apy<dux> $$3 = a($$0);
         String $$4 = $$0.has("decoration") ? arf.i($$0, "decoration") : "mansion";
         ebi.a $$5 = edq.c;

         try {
            $$5 = ebi.a.valueOf($$4.toUpperCase(Locale.ROOT));
         } catch (IllegalArgumentException var10) {
            edq.h.error("Error while parsing loot table decoration entry. Found {}. Defaulting to {}", $$4, edq.c);
         }

         byte $$7 = arf.a($$0, "zoom", (byte)2);
         int $$8 = arf.a($$0, "search_radius", 50);
         boolean $$9 = arf.a($$0, "skip_existing_chunks", true);
         return new edq($$2, $$3, $$5, $$7, $$8, $$9);
      }

      private static apy<dux> a(JsonObject $$0) {
         if ($$0.has("destination")) {
            String $$1 = arf.i($$0, "destination");
            return apy.a(jd.az, new aep($$1));
         } else {
            return edq.a;
         }
      }
   }
}
