import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eia(List<ehp> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akn c = new akn("jigsaw");
   private static final Map<akn, akn> d = ImmutableMap.builder()
      .put(new akn("nvi"), c)
      .put(new akn("pcp"), c)
      .put(new akn("bastionremnant"), c)
      .put(new akn("runtime"), c)
      .build();

   public eia(List<ehp> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(io $$0) {
      for (ehp $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public va a(eib $$0) {
      uj $$1 = new uj();

      for (ehp $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eia a(uj $$0, eib $$1) {
      List<ehp> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ud $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akn $$6 = new akn($$5);
         akn $$7 = d.getOrDefault($$6, $$6);
         eic $$8 = le.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ehp $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eia($$2);
   }

   public ehd b() {
      return ehp.a(this.a.stream());
   }

   public List<ehp> c() {
      return this.a;
   }
}
