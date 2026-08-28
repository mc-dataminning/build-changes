import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.LongSerializationPolicy;
import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class brx {
   private static final String b = "bytesPerSecond";
   private static final String c = "count";
   private static final String d = "durationNanosTotal";
   private static final String e = "totalBytes";
   private static final String f = "countPerSecond";
   final Gson a = new GsonBuilder().setPrettyPrinting().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();

   private static void a(bsf $$0, JsonObject $$1) {
      $$1.addProperty("protocolId", $$0.b());
      $$1.addProperty("packetId", $$0.c());
   }

   private static void a(bsa $$0, JsonObject $$1) {
      $$1.addProperty("level", $$0.a());
      $$1.addProperty("dimension", $$0.b());
      $$1.addProperty("x", $$0.c());
      $$1.addProperty("z", $$0.d());
   }

   public String a(brv $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("startedEpoch", $$0.c().toEpochMilli());
      $$1.addProperty("endedEpoch", $$0.d().toEpochMilli());
      $$1.addProperty("durationMs", $$0.e().toMillis());
      Duration $$2 = $$0.f();
      if ($$2 != null) {
         $$1.addProperty("worldGenDurationMs", $$2.toMillis());
      }

      $$1.add("heap", this.a($$0.i()));
      $$1.add("cpuPercent", this.d($$0.h()));
      $$1.add("network", this.c($$0));
      $$1.add("fileIO", this.b($$0));
      $$1.add("serverTick", this.c($$0.g()));
      $$1.add("threadAllocation", this.a($$0.j()));
      $$1.add("chunkGen", this.b($$0.a()));
      $$1.add("structureGen", this.a($$0.r()));
      return this.a.toJson($$1);
   }

   private JsonElement a(bsd.a $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("allocationRateBytesPerSecond", $$0.e());
      $$1.addProperty("gcCount", $$0.d());
      $$1.addProperty("gcOverHeadPercent", $$0.a());
      $$1.addProperty("gcTotalDurationMs", $$0.c().toMillis());
      return $$1;
   }

   private JsonElement a(List<bsg> $$0) {
      JsonObject $$1 = new JsonObject();
      bsk<bsg> $$2 = bsk.a($$0);
      JsonArray $$3 = new JsonArray();
      $$1.add("structure", $$3);
      $$0.stream().collect(Collectors.groupingBy(bsg::c)).forEach(($$3x, $$4) -> {
         JsonObject $$5 = new JsonObject();
         $$3.add($$5);
         $$5.addProperty("name", $$3x);
         bsk<bsg> $$6 = bsk.a((List<bsg>)$$4);
         $$5.addProperty("count", $$6.d());
         $$5.addProperty("durationNanosTotal", $$6.f().toNanos());
         $$5.addProperty("durationNanosAvg", $$6.f().toNanos() / (long)$$6.d());
         JsonObject $$7 = ag.a(new JsonObject(), $$1xx -> $$5.add("durationNanosPercentiles", $$1xx));
         $$6.e().forEach(($$1xx, $$2xx) -> $$7.addProperty("p" + $$1xx, $$2xx));
         Function<bsg, JsonElement> $$8 = $$0xx -> {
            JsonObject $$1xx = new JsonObject();
            $$1xx.addProperty("durationNanos", $$0xx.a().toNanos());
            $$1xx.addProperty("chunkPosX", $$0xx.b().h);
            $$1xx.addProperty("chunkPosZ", $$0xx.b().i);
            $$1xx.addProperty("structureName", $$0xx.c());
            $$1xx.addProperty("level", $$0xx.d());
            $$1xx.addProperty("success", $$0xx.e());
            return $$1xx;
         };
         $$1.add("fastest", $$8.apply($$2.a()));
         $$1.add("slowest", $$8.apply($$2.b()));
         $$1.add("secondSlowest", (JsonElement)($$2.c() != null ? $$8.apply($$2.c()) : JsonNull.INSTANCE));
      });
      return $$1;
   }

   private JsonElement b(List<Pair<eee, bsk<brz>>> $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("durationNanosTotal", $$0.stream().mapToDouble($$0x -> (double)((bsk)$$0x.getSecond()).f().toNanos()).sum());
      JsonArray $$2 = ag.a(new JsonArray(), $$1x -> $$1.add("status", $$1x));

      for (Pair<eee, bsk<brz>> $$3 : $$0) {
         bsk<brz> $$4 = (bsk<brz>)$$3.getSecond();
         JsonObject $$5 = ag.a(new JsonObject(), $$2::add);
         $$5.addProperty("state", ((eee)$$3.getFirst()).toString());
         $$5.addProperty("count", $$4.d());
         $$5.addProperty("durationNanosTotal", $$4.f().toNanos());
         $$5.addProperty("durationNanosAvg", $$4.f().toNanos() / (long)$$4.d());
         JsonObject $$6 = ag.a(new JsonObject(), $$1x -> $$5.add("durationNanosPercentiles", $$1x));
         $$4.e().forEach(($$1x, $$2x) -> $$6.addProperty("p" + $$1x, $$2x));
         Function<brz, JsonElement> $$7 = $$0x -> {
            JsonObject $$1x = new JsonObject();
            $$1x.addProperty("durationNanos", $$0x.a().toNanos());
            $$1x.addProperty("level", $$0x.e());
            $$1x.addProperty("chunkPosX", $$0x.b().h);
            $$1x.addProperty("chunkPosZ", $$0x.b().i);
            $$1x.addProperty("worldPosX", $$0x.c().c());
            $$1x.addProperty("worldPosZ", $$0x.c().d());
            return $$1x;
         };
         $$5.add("fastest", $$7.apply($$4.a()));
         $$5.add("slowest", $$7.apply($$4.b()));
         $$5.add("secondSlowest", (JsonElement)($$4.c() != null ? $$7.apply($$4.c()) : JsonNull.INSTANCE));
      }

      return $$1;
   }

   private JsonElement a(bsh.a $$0) {
      JsonArray $$1 = new JsonArray();
      $$0.a().forEach(($$1x, $$2) -> $$1.add(ag.a(new JsonObject(), $$2x -> {
            $$2x.addProperty("thread", $$1x);
            $$2x.addProperty("bytesPerSecond", $$2);
         })));
      return $$1;
   }

   private JsonElement c(List<bsi> $$0) {
      if ($$0.isEmpty()) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$1 = new JsonObject();
         double[] $$2 = $$0.stream().mapToDouble($$0x -> (double)$$0x.b().toNanos() / 1000000.0).toArray();
         DoubleSummaryStatistics $$3 = DoubleStream.of($$2).summaryStatistics();
         $$1.addProperty("minMs", $$3.getMin());
         $$1.addProperty("averageMs", $$3.getAverage());
         $$1.addProperty("maxMs", $$3.getMax());
         Map<Integer, Double> $$4 = brm.a($$2);
         $$4.forEach(($$1x, $$2x) -> $$1.addProperty("p" + $$1x, $$2x));
         return $$1;
      }
   }

   private JsonElement b(brv $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("write", this.a($$0.o()));
      $$1.add("read", this.a($$0.p()));
      $$1.add("chunksRead", this.a($$0.n(), brx::a));
      $$1.add("chunksWritten", this.a($$0.m(), brx::a));
      return $$1;
   }

   private JsonElement a(bsc.a $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("totalBytes", $$0.a());
      $$1.addProperty("count", $$0.c());
      $$1.addProperty("bytesPerSecond", $$0.b());
      $$1.addProperty("countPerSecond", $$0.d());
      JsonArray $$2 = new JsonArray();
      $$1.add("topContributors", $$2);
      $$0.f().forEach($$1x -> {
         JsonObject $$2x = new JsonObject();
         $$2.add($$2x);
         $$2x.addProperty("path", (String)$$1x.getFirst());
         $$2x.addProperty("totalBytes", (Number)$$1x.getSecond());
      });
      return $$1;
   }

   private JsonElement c(brv $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("sent", this.a($$0.l(), brx::a));
      $$1.add("received", this.a($$0.k(), brx::a));
      return $$1;
   }

   private <T> JsonElement a(bse<T> $$0, BiConsumer<T, JsonObject> $$1) {
      JsonObject $$2 = new JsonObject();
      $$2.addProperty("totalBytes", $$0.d());
      $$2.addProperty("count", $$0.c());
      $$2.addProperty("bytesPerSecond", $$0.b());
      $$2.addProperty("countPerSecond", $$0.a());
      JsonArray $$3 = new JsonArray();
      $$2.add("topContributors", $$3);
      $$0.e().forEach($$2x -> {
         JsonObject $$3x = new JsonObject();
         $$3.add($$3x);
         T $$4 = (T)$$2x.getFirst();
         bse.a $$5 = (bse.a)$$2x.getSecond();
         $$1.accept($$4, $$3x);
         $$3x.addProperty("totalBytes", $$5.c());
         $$3x.addProperty("count", $$5.b());
         $$3x.addProperty("averageSize", $$5.a());
      });
      return $$2;
   }

   private JsonElement d(List<bsb> $$0) {
      JsonObject $$1 = new JsonObject();
      BiFunction<List<bsb>, ToDoubleFunction<bsb>, JsonObject> $$2 = ($$0x, $$1x) -> {
         JsonObject $$2x = new JsonObject();
         DoubleSummaryStatistics $$3 = $$0x.stream().mapToDouble($$1x).summaryStatistics();
         $$2x.addProperty("min", $$3.getMin());
         $$2x.addProperty("average", $$3.getAverage());
         $$2x.addProperty("max", $$3.getMax());
         return $$2x;
      };
      $$1.add("jvm", (JsonElement)$$2.apply($$0, bsb::a));
      $$1.add("userJvm", (JsonElement)$$2.apply($$0, bsb::b));
      $$1.add("system", (JsonElement)$$2.apply($$0, bsb::c));
      return $$1;
   }
}
