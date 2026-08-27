import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.List;

public class ebf extends eay {
   final List<eaf> a;
   final czp<?> b;

   ebf(eck[] $$0, czp<?> $$1, List<eaf> $$2) {
      super($$0);
      this.b = $$1;
      this.a = ImmutableList.copyOf($$2);
   }

   @Override
   public eba b() {
      return ebb.o;
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hn<cfz> $$2 = hn.a();
         this.a.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(dzs.a($$1.d(), $$2::add), $$1)));
         qr $$3 = new qr();
         bdr.a($$3, $$2);
         qr $$4 = cds.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cds.a($$0, this.b, $$4);
         return $$0;
      }
   }

   @Override
   public void a(dzv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
         this.a.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static ebf.a a(czp<?> $$0) {
      return new ebf.a($$0);
   }

   public static class a extends eay.a<ebf.a> {
      private final List<eaf> a = Lists.newArrayList();
      private final czp<?> b;

      public a(czp<?> $$0) {
         this.b = $$0;
      }

      protected ebf.a a() {
         return this;
      }

      public ebf.a a(eaf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eaz b() {
         return new ebf(this.g(), this.b, this.a);
      }
   }

   public static class b extends eay.c<ebf> {
      public void a(JsonObject $$0, ebf $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("type", jb.l.b($$1.b).toString());
         $$0.add("entries", $$2.serialize($$1.a));
      }

      public ebf a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         eaf[] $$3 = aor.a($$0, "entries", $$1, eaf[].class);
         acq $$4 = new acq(aor.i($$0, "type"));
         czp<?> $$5 = jb.l.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown block entity type id '" + $$4 + "'"));
         return new ebf($$2, $$5, Arrays.asList($$3));
      }
   }
}
