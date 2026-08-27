import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ehe(List<egt> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akh c = new akh("jigsaw");
   private static final Map<akh, akh> d = ImmutableMap.builder()
      .put(new akh("nvi"), c)
      .put(new akh("pcp"), c)
      .put(new akh("bastionremnant"), c)
      .put(new akh("runtime"), c)
      .build();

   public ehe(List<egt> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(in $$0) {
      for (egt $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public ux a(ehf $$0) {
      ug $$1 = new ug();

      for (egt $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ehe a(ug $$0, ehf $$1) {
      List<egt> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akh $$6 = new akh($$5);
         akh $$7 = d.getOrDefault($$6, $$6);
         ehg $$8 = ld.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               egt $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ehe($$2);
   }

   public egh b() {
      return egt.a(this.a.stream());
   }

   public List<egt> c() {
      return this.a;
   }
}
