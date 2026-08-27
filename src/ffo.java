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

public class ffo {
   private final ffo.b a;
   private final AbuseReportLimits b;

   public ffo(ffo.b $$0, AbuseReportLimits $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ffo(UUID $$0, AbuseReportLimits $$1) {
      this.a = new ffo.b(UUID.randomUUID(), Instant.now(), $$0);
      this.b = $$1;
   }

   public ffo.b a() {
      return this.a;
   }

   public UUID b() {
      return this.a.d;
   }

   public IntSet c() {
      return this.a.e;
   }

   public String d() {
      return this.a.f;
   }

   public void a(String $$0) {
      this.a.f = $$0;
   }

   @Nullable
   public ffr e() {
      return this.a.g;
   }

   public void a(ffr $$0) {
      this.a.g = $$0;
   }

   public void a(int $$0) {
      this.a.a($$0, this.b);
   }

   public boolean b(int $$0) {
      return this.a.e.contains($$0);
   }

   public boolean f() {
      return StringUtils.isNotEmpty(this.d()) || !this.c().isEmpty() || this.e() != null;
   }

   @Nullable
   public ffo.a g() {
      if (this.a.e.isEmpty()) {
         return ffo.a.b;
      } else if (this.a.e.size() > this.b.maxReportedMessageCount()) {
         return ffo.a.c;
      } else if (this.a.g == null) {
         return ffo.a.a;
      } else {
         return this.a.f.length() > this.b.maxOpinionCommentsLength() ? ffo.a.d : null;
      }
   }

   public Either<ffo.c, ffo.a> a(ffs $$0) {
      ffo.a $$1 = this.g();
      if ($$1 != null) {
         return Either.right($$1);
      } else {
         String $$2 = Objects.requireNonNull(this.a.g).a();
         ReportEvidence $$3 = this.a($$0.b());
         ReportedEntity $$4 = new ReportedEntity(this.a.d);
         AbuseReport $$5 = new AbuseReport(this.a.f, $$2, $$3, $$4, this.a.c);
         return Either.left(new ffo.c(this.a.b, $$5));
      }
   }

   private ReportEvidence a(ffh $$0) {
      List<ReportChatMessage> $$1 = new ArrayList<>();
      ffp $$2 = new ffp(this.b.leadingContextMessageCount());
      $$2.a($$0, this.a.e, ($$1x, $$2x) -> $$1.add(this.a($$2x, this.b($$1x))));
      return new ReportEvidence(Lists.reverse($$1));
   }

   private ReportChatMessage a(ffk.a $$0, boolean $$1) {
      tq $$2 = $$0.g().j();
      to $$3 = $$0.g().l();
      List<ByteBuffer> $$4 = $$3.d().a().stream().map(th::a).toList();
      ByteBuffer $$5 = x.a($$0.g().k(), th::a);
      return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
   }

   public ffo h() {
      return new ffo(this.a.a(), this.b);
   }

   public static record a(sw e) {
      public static final ffo.a a = new ffo.a(sw.c("gui.chatReport.send.no_reason"));
      public static final ffo.a b = new ffo.a(sw.c("gui.chatReport.send.no_reported_messages"));
      public static final ffo.a c = new ffo.a(sw.c("gui.chatReport.send.too_many_messages"));
      public static final ffo.a d = new ffo.a(sw.c("gui.chatReport.send.comments_too_long"));

      public sw a() {
         return this.e;
      }
   }

   public class b {
      final UUID b;
      final Instant c;
      final UUID d;
      final IntSet e = new IntOpenHashSet();
      String f = "";
      @Nullable
      ffr g;

      b(UUID $$1, Instant $$2, UUID $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(int $$0, AbuseReportLimits $$1) {
         if (this.e.contains($$0)) {
            this.e.remove($$0);
         } else if (this.e.size() < $$1.maxReportedMessageCount()) {
            this.e.add($$0);
         }
      }

      public ffo.b a() {
         ffo.b $$0 = ffo.this.new b(this.b, this.c, this.d);
         $$0.e.addAll(this.e);
         $$0.f = this.f;
         $$0.g = this.g;
         return $$0;
      }

      public boolean a(UUID $$0) {
         return $$0.equals(this.d);
      }
   }

   public static record c(UUID a, AbuseReport b) {
   }
}
