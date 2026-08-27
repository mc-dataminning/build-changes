import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eei extends edv {
   final boolean a;
   final List<te> b;
   @Nullable
   final ech.b c;

   public eei(efh[] $$0, boolean $$1, List<te> $$2, @Nullable ech.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = ImmutableList.copyOf($$2);
      this.c = $$3;
   }

   @Override
   public edx b() {
      return edy.t;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.c != null ? ImmutableSet.of(this.c.a()) : ImmutableSet.of();
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      qy $$2 = this.a($$0, !this.b.isEmpty());
      if ($$2 != null) {
         if (this.a) {
            $$2.clear();
         }

         UnaryOperator<te> $$3 = eej.a($$1, this.c);
         this.b.stream().map($$3).map(te.a::a).map(rj::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private qy a(ciw $$0, boolean $$1) {
      qs $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new qs();
         $$0.c($$2);
      }

      qs $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new qs();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         qy $$8 = new qy();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eei.a c() {
      return new eei.a();
   }

   public static class a extends edv.a<eei.a> {
      private boolean a;
      private ech.b b;
      private final List<te> c = Lists.newArrayList();

      public eei.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eei.a a(ech.b $$0) {
         this.b = $$0;
         return this;
      }

      public eei.a a(te $$0) {
         this.c.add($$0);
         return this;
      }

      protected eei.a a() {
         return this;
      }

      @Override
      public edw b() {
         return new eei(this.g(), this.a, this.c, this.b);
      }
   }

   public static class b extends edv.c<eei> {
      public void a(JsonObject $$0, eei $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("replace", $$1.a);
         JsonArray $$3 = new JsonArray();

         for (te $$4 : $$1.b) {
            $$3.add(te.a.c($$4));
         }

         $$0.add("lore", $$3);
         if ($$1.c != null) {
            $$0.add("entity", $$2.serialize($$1.c));
         }
      }

      public eei a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         boolean $$3 = arf.a($$0, "replace", false);
         List<te> $$4 = Streams.stream(arf.v($$0, "lore")).map(te.a::a).collect(ImmutableList.toImmutableList());
         ech.b $$5 = arf.a($$0, "entity", null, $$1, ech.b.class);
         return new eei($$2, $$3, $$4, $$5);
      }
   }
}
