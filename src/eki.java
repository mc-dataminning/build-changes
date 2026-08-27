import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eki(List<ejx> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akt c = new akt("jigsaw");
   private static final Map<akt, akt> d = ImmutableMap.builder()
      .put(new akt("nvi"), c)
      .put(new akt("pcp"), c)
      .put(new akt("bastionremnant"), c)
      .put(new akt("runtime"), c)
      .build();

   public eki(List<ejx> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ir $$0) {
      for (ejx $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vh a(ekj $$0) {
      uq $$1 = new uq();

      for (ejx $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eki a(uq $$0, ekj $$1) {
      List<ejx> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uk $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akt $$6 = new akt($$5);
         akt $$7 = d.getOrDefault($$6, $$6);
         ekk $$8 = lh.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ejx $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eki($$2);
   }

   public ejl b() {
      return ejx.a(this.a.stream());
   }

   public List<ejx> c() {
      return this.a;
   }
}
