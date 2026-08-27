import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ebt(List<ebi> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aiy c = new aiy("jigsaw");
   private static final Map<aiy, aiy> d = ImmutableMap.builder()
      .put(new aiy("nvi"), c)
      .put(new aiy("pcp"), c)
      .put(new aiy("bastionremnant"), c)
      .put(new aiy("runtime"), c)
      .build();

   public ebt(List<ebi> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(hz $$0) {
      for (ebi $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tt a(ebu $$0) {
      tc $$1 = new tc();

      for (ebi $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ebt a(tc $$0, ebu $$1) {
      List<ebi> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         sw $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aiy $$6 = new aiy($$5);
         aiy $$7 = d.getOrDefault($$6, $$6);
         ebv $$8 = kf.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ebi $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ebt($$2);
   }

   public eaw b() {
      return ebi.a(this.a.stream());
   }

   public List<ebi> c() {
      return this.a;
   }
}
