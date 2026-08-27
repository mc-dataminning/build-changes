import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.Set;
import org.slf4j.Logger;

public class eat extends eay {
   static final Logger h = LogUtils.getLogger();
   public static final anl<dsa> a = anh.e;
   public static final String b = "mansion";
   public static final dyl.a c = dyl.a.i;
   public static final byte d = 2;
   public static final int e = 50;
   public static final boolean f = true;
   final anl<dsa> i;
   final dyl.a j;
   final byte k;
   final int l;
   final boolean m;

   eat(eck[] $$0, anl<dsa> $$1, dyl.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = $$4;
      this.m = $$5;
   }

   @Override
   public eba b() {
      return ebb.l;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.f);
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      if (!$$0.a(cgc.tp)) {
         return $$0;
      } else {
         eei $$2 = $$1.c(ebw.f);
         if ($$2 != null) {
            aif $$3 = $$1.d();
            gu $$4 = $$3.a(this.i, gu.a($$2), this.l, this.m);
            if ($$4 != null) {
               cfz $$5 = cgg.a($$3, $$4.u(), $$4.w(), this.k, true, true);
               cgg.a($$3, $$5);
               dyo.a($$5, $$4, "+", this.j);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eat.a c() {
      return new eat.a();
   }

   public static class a extends eay.a<eat.a> {
      private anl<dsa> a;
      private dyl.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eat.a;
         this.b = eat.c;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eat.a a() {
         return this;
      }

      public eat.a a(anl<dsa> $$0) {
         this.a = $$0;
         return this;
      }

      public eat.a a(dyl.a $$0) {
         this.b = $$0;
         return this;
      }

      public eat.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eat.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eat.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eaz b() {
         return new eat(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }

   public static class b extends eay.c<eat> {
      public void a(JsonObject $$0, eat $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.i.equals(eat.a)) {
            $$0.addProperty("destination", $$1.i.b().toString());
         }

         if ($$1.j != eat.c) {
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

      public eat a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         anl<dsa> $$3 = a($$0);
         String $$4 = $$0.has("decoration") ? aor.i($$0, "decoration") : "mansion";
         dyl.a $$5 = eat.c;

         try {
            $$5 = dyl.a.valueOf($$4.toUpperCase(Locale.ROOT));
         } catch (IllegalArgumentException var10) {
            eat.h.error("Error while parsing loot table decoration entry. Found {}. Defaulting to {}", $$4, eat.c);
         }

         byte $$7 = aor.a($$0, "zoom", (byte)2);
         int $$8 = aor.a($$0, "search_radius", 50);
         boolean $$9 = aor.a($$0, "skip_existing_chunks", true);
         return new eat($$2, $$3, $$5, $$7, $$8, $$9);
      }

      private static anl<dsa> a(JsonObject $$0) {
         if ($$0.has("destination")) {
            String $$1 = aor.i($$0, "destination");
            return anl.a(jc.az, new acq($$1));
         } else {
            return eat.a;
         }
      }
   }
}
