import com.google.common.collect.Lists;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportChatMessage;
import com.mojang.authlib.minecraft.report.ReportEvidence;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fjo extends fjr {
   final IntSet f = new IntOpenHashSet();

   fjo(UUID $$0, Instant $$1, UUID $$2) {
      super($$0, $$1, $$2);
   }

   public void a(int $$0, AbuseReportLimits $$1) {
      if (this.f.contains($$0)) {
         this.f.remove($$0);
      } else if (this.f.size() < $$1.maxReportedMessageCount()) {
         this.f.add($$0);
      }
   }

   public fjo a() {
      fjo $$0 = new fjo(this.a, this.b, this.c);
      $$0.f.addAll(this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public eye a(eye $$0, fjv $$1) {
      return new fcc($$0, $$1, this);
   }

   public static class a extends fjr.a<fjo> {
      public a(fjo $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, AbuseReportLimits $$1) {
         super(new fjo(UUID.randomUUID(), Instant.now(), $$0), $$1);
      }

      public IntSet a() {
         return this.a.f;
      }

      public void a(int $$0) {
         this.a.a($$0, this.b);
      }

      public boolean b(int $$0) {
         return this.a.f.contains($$0);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || !this.a().isEmpty() || this.h() != null;
      }

      @Nullable
      @Override
      public fjr.b c() {
         if (this.a.f.isEmpty()) {
            return fjr.b.b;
         } else if (this.a.f.size() > this.b.maxReportedMessageCount()) {
            return fjr.b.c;
         } else if (this.a.e == null) {
            return fjr.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fjr.b.d : null;
         }
      }

      @Override
      public Either<fjr.c, fjr.b> a(fjv $$0) {
         fjr.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportEvidence $$3 = this.b($$0);
            ReportedEntity $$4 = new ReportedEntity(this.a.c);
            AbuseReport $$5 = AbuseReport.chat(this.a.d, $$2, $$3, $$4, this.a.b);
            return Either.left(new fjr.c(this.a.a, fju.a, $$5));
         }
      }

      private ReportEvidence b(fjv $$0) {
         List<ReportChatMessage> $$1 = new ArrayList<>();
         fjp $$2 = new fjp(this.b.leadingContextMessageCount());
         $$2.a($$0.b(), this.a.f, ($$1x, $$2x) -> $$1.add(this.a($$2x, this.b($$1x))));
         return new ReportEvidence(Lists.reverse($$1));
      }

      private ReportChatMessage a(fjk.a $$0, boolean $$1) {
         ug $$2 = $$0.g().j();
         ue $$3 = $$0.g().l();
         List<ByteBuffer> $$4 = $$3.d().a().stream().map(tx::a).toList();
         ByteBuffer $$5 = x.a($$0.g().k(), tx::a);
         return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
      }

      public fjo.a d() {
         return new fjo.a(this.a.a(), this.b);
      }
   }
}
