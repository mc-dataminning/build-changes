import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record emm(List<emb> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ali c = ali.b("jigsaw");
   private static final Map<ali, ali> d = ImmutableMap.builder()
      .put(ali.b("nvi"), c)
      .put(ali.b("pcp"), c)
      .put(ali.b("bastionremnant"), c)
      .put(ali.b("runtime"), c)
      .build();

   public emm(final List<emb> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jh $$0) {
      for (emb $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vh a(emn $$0) {
      uq $$1 = new uq();

      for (emb $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static emm a(uq $$0, emn $$1) {
      List<emb> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uk $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ali $$6 = ali.a($$5);
         ali $$7 = d.getOrDefault($$6, $$6);
         emo $$8 = ly.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               emb $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new emm($$2);
   }

   public elp b() {
      return emb.a(this.a.stream());
   }

   public List<emb> c() {
      return this.a;
   }
}
