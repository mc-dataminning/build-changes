import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ejb(List<eiq> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alf c = new alf("jigsaw");
   private static final Map<alf, alf> d = ImmutableMap.builder()
      .put(new alf("nvi"), c)
      .put(new alf("pcp"), c)
      .put(new alf("bastionremnant"), c)
      .put(new alf("runtime"), c)
      .build();

   public ejb(final List<eiq> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iz $$0) {
      for (eiq $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vp a(ejc $$0) {
      uy $$1 = new uy();

      for (eiq $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ejb a(uy $$0, ejc $$1) {
      List<eiq> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         us $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alf $$6 = new alf($$5);
         alf $$7 = d.getOrDefault($$6, $$6);
         ejd $$8 = lp.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eiq $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ejb($$2);
   }

   public eie b() {
      return eiq.a(this.a.stream());
   }

   public List<eiq> c() {
      return this.a;
   }
}
