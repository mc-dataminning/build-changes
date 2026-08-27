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
import java.util.stream.DoubleStream;

public class blw {
   private static final String b = "bytesPerSecond";
   private static final String c = "count";
   private static final String d = "durationNanosTotal";
   private static final String e = "totalBytes";
   private static final String f = "countPerSecond";
   final Gson a = new GsonBuilder().setPrettyPrinting().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();

   private static void a(bme $$0, JsonObject $$1) {
      $$1.addProperty("protocolId", $$0.b());
      $$1.addProperty("packetId", $$0.c());
   }

   private static void a(blz $$0, JsonObject $$1) {
      $$1.addProperty("level", $$0.a());
      $$1.addProperty("dimension", $$0.b());
      $$1.addProperty("x", $$0.c());
      $$1.addProperty("z", $$0.d());
   }

   public String a(blu $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("startedEpoch", $$0.c().toEpochMilli());
      $$1.addProperty("endedEpoch", $$0.d().toEpochMilli());
      $$1.addProperty("durationMs", $$0.e().toMillis());
      Duration $$2 = $$0.f();
      if ($$2 != null) {
         $$1.addProperty("worldGenDurationMs", $$2.toMillis());
      }

      $$1.add("heap", this.a($$0.i()));
      $$1.add("cpuPercent", this.c($$0.h()));
      $$1.add("network", this.c($$0));
      $$1.add("fileIO", this.b($$0));
      $$1.add("serverTick", this.b($$0.g()));
      $$1.add("threadAllocation", this.a($$0.j()));
      $$1.add("chunkGen", this.a($$0.a()));
      return this.a.toJson($$1);
   }

   private JsonElement a(bmc.a $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("allocationRateBytesPerSecond", $$0.e());
      $$1.addProperty("gcCount", $$0.d());
      $$1.addProperty("gcOverHeadPercent", $$0.a());
      $$1.addProperty("gcTotalDurationMs", $$0.c().toMillis());
      return $$1;
   }

   private JsonElement a(List<Pair<dst, bmi<bly>>> $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("durationNanosTotal", $$0.stream().mapToDouble($$0x -> (double)((bmi)$$0x.getSecond()).f().toNanos()).sum());
      JsonArray $$2 = ac.a(new JsonArray(), $$1x -> $$1.add("status", $$1x));

      for (Pair<dst, bmi<bly>> $$3 : $$0) {
         bmi<bly> $$4 = (bmi<bly>)$$3.getSecond();
         JsonObject $$5 = ac.a(new JsonObject(), $$2::add);
         $$5.addProperty("state", ((dst)$$3.getFirst()).toString());
         $$5.addProperty("count", $$4.d());
         $$5.addProperty("durationNanosTotal", $$4.f().toNanos());
         $$5.addProperty("durationNanosAvg", $$4.f().toNanos() / (long)$$4.d());
         JsonObject $$6 = ac.a(new JsonObject(), $$1x -> $$5.add("durationNanosPercentiles", $$1x));
         $$4.e().forEach(($$1x, $$2x) -> $$6.addProperty("p" + $$1x, $$2x));
         Function<bly, JsonElement> $$7 = $$0x -> {
            JsonObject $$1x = new JsonObject();
            $$1x.addProperty("durationNanos", $$0x.a().toNanos());
            $$1x.addProperty("level", $$0x.e());
            $$1x.addProperty("chunkPosX", $$0x.b().e);
            $$1x.addProperty("chunkPosZ", $$0x.b().f);
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

   private JsonElement a(bmf.a $$0) {
      JsonArray $$1 = new JsonArray();
      $$0.a().forEach(($$1x, $$2) -> $$1.add(ac.a(new JsonObject(), $$2x -> {
            $$2x.addProperty("thread", $$1x);
            $$2x.addProperty("bytesPerSecond", $$2);
         })));
      return $$1;
   }

   private JsonElement b(List<bmg> $$0) {
      if ($$0.isEmpty()) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$1 = new JsonObject();
         double[] $$2 = $$0.stream().mapToDouble($$0x -> (double)$$0x.b().toNanos() / 1000000.0).toArray();
         DoubleSummaryStatistics $$3 = DoubleStream.of($$2).summaryStatistics();
         $$1.addProperty("minMs", $$3.getMin());
         $$1.addProperty("averageMs", $$3.getAverage());
         $$1.addProperty("maxMs", $$3.getMax());
         Map<Integer, Double> $$4 = bll.a($$2);
         $$4.forEach(($$1x, $$2x) -> $$1.addProperty("p" + $$1x, $$2x));
         return $$1;
      }
   }

   private JsonElement b(blu $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("write", this.a($$0.o()));
      $$1.add("read", this.a($$0.p()));
      $$1.add("chunksRead", this.a($$0.n(), blw::a));
      $$1.add("chunksWritten", this.a($$0.m(), blw::a));
      return $$1;
   }

   private JsonElement a(bmb.a $$0) {
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

   private JsonElement c(blu $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("sent", this.a($$0.l(), blw::a));
      $$1.add("received", this.a($$0.k(), blw::a));
      return $$1;
   }

   private <T> JsonElement a(bmd<T> $$0, BiConsumer<T, JsonObject> $$1) {
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
         bmd.a $$5 = (bmd.a)$$2x.getSecond();
         $$1.accept($$4, $$3x);
         $$3x.addProperty("totalBytes", $$5.c());
         $$3x.addProperty("count", $$5.b());
         $$3x.addProperty("averageSize", $$5.a());
      });
      return $$2;
   }

   private JsonElement c(List<bma> $$0) {
      JsonObject $$1 = new JsonObject();
      BiFunction<List<bma>, ToDoubleFunction<bma>, JsonObject> $$2 = ($$0x, $$1x) -> {
         JsonObject $$2x = new JsonObject();
         DoubleSummaryStatistics $$3 = $$0x.stream().mapToDouble($$1x).summaryStatistics();
         $$2x.addProperty("min", $$3.getMin());
         $$2x.addProperty("average", $$3.getAverage());
         $$2x.addProperty("max", $$3.getMax());
         return $$2x;
      };
      $$1.add("jvm", (JsonElement)$$2.apply($$0, bma::a));
      $$1.add("userJvm", (JsonElement)$$2.apply($$0, bma::b));
      $$1.add("system", (JsonElement)$$2.apply($$0, bma::c));
      return $$1;
   }
}
